package com.qa.tests;

import org.openqa.selenium.By;

public class AddMultipleProduct extends ValidLoginTest {
    public void addproduct(){
        login();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
        String count=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
        if (count.equals("2")){
            System.out.println("Add to cart  multiple product test passed!");
        }
        else{
            System.out.println("Add to cart  multiple product test failed!");
        }


    }
}
