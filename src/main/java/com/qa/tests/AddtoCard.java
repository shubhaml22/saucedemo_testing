package com.qa.tests;

import org.openqa.selenium.By;

public class AddtoCard extends ValidLoginTest{

    public void addproduct(){
        login();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        String count=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
        if (count.equals("1")){
            System.out.println("Add to cart test passed!");
        }
        else{
            System.out.println("Add to cart test failed!");
        }
    }
}
