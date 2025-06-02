package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyTittleAndHeading extends ValidLoginTest{
    public void verify(){
        login();
        String title=driver.getTitle();
        String head=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();

        if (title.equals("Swag Labs") && head.equals("Swag Labs")){
            System.out.println("Title is match ,Test Passed!");

        }
        else {
            System.out.println("Test Failed");
        }

        teardown();
    }
}
