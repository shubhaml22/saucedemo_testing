package com.qa.tests;

import com.qa.base.BaseClass;
import org.openqa.selenium.By;

public class InvalidLoginTest extends BaseClass {
    public void login() {
        setup();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Wrong_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        boolean errorvisible=driver.getPageSource().contains("Epic sadface");


        if (errorvisible) {
            System.out.println("Invalid Login Test passed !");
        } else {
            System.out.println("Test failed !");
        }
        driver.quit();
    }
}
