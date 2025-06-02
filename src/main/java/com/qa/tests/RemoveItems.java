package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.LoadableComponent;

public class RemoveItems extends AddtoCard {

    public void remove_i(){
        addproduct();
        driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
        boolean isCardBadgeVisible=driver.findElements(By.className("shopping_cart_badge")).size() > 0;

        if (!isCardBadgeVisible){
            System.out.println("Remove item test passed!");
        }
        else {
            System.out.println("Remove item test filed!");
        }
        driver.quit();

    }
}
