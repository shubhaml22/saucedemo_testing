package com.qa.tests;
import com.qa.base.BaseClass;
import org.openqa.selenium.By;

public class ValidLoginTest extends BaseClass {
    public void login(){
        setup();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        String curUrl= driver.getCurrentUrl();

        if (curUrl.contains("inventory")){
            System.out.println("Login successfully ! Test passed");
        }
        else {
            System.out.println("Test failed !");
        }
        teardown();

    }
}
