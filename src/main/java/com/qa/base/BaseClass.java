package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;

    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void teardown(){

        if (driver !=null){
            driver.quit();
        }

    }
}
