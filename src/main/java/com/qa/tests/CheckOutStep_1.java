package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutStep_1 extends AddMultipleProduct{
    public void checkOut1(){
        addproduct();

    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Page title: " + driver.getTitle());

        try {
            WebElement checkoutBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"checkout\"]")));
            System.out.println("Checkout button found");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.getElementById('checkout').click();");
//            driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("shubham");
//            driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("labana");
//            driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("457001");
////            js.executeScript("document.querySelector(\"#continue\").click();");

        } catch (TimeoutException e) {
            System.out.println("Checkout button not found after 10 seconds.");
            System.out.println(driver.getPageSource());  // Optional: print HTML
        }

    }
}
