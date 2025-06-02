package com.qa.tests;

import com.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class checkOutStep_2 extends CheckOutStep_1 {
    public void checkOut2() {
        checkOut1(); // Assumes this clicks the checkout button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("URL at checkOut2(): " + driver.getCurrentUrl());
        System.out.println("Page Title at checkOut2(): " + driver.getTitle());

        try {
            WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
            firstName.sendKeys("shubham");

            driver.findElement(By.id("last-name")).sendKeys("labana");
            driver.findElement(By.id("postal-code")).sendKeys("457001");

            driver.findElement(By.id("continue")).click();
            System.out.println("checkOut2: Form filled and continued");

        } catch (TimeoutException e) {
            System.out.println("⚠️ ERROR: Form elements not found - maybe page didn’t load?");
        } catch (NoSuchElementException e) {
            System.out.println("⚠️ ERROR: One of the form fields couldn’t be found");
        } catch (Exception e) {
            System.out.println("⚠️ ERROR: Something else went wrong: " + e.getMessage());
        }
    }

}
