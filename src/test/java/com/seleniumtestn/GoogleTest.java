package com.seleniumtestn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class GoogleTest {

    WebDriver driver;

    // Runs once before any @Test method in the class
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    // This is the actual test method
    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.xpath("//*[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("secret_sauce");
        Thread.sleep(3000);
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        btn.click();




    }



//     Runs once after all @Test methods
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
