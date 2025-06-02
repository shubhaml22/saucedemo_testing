package com.qa.tests;

import com.qa.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutTest extends ValidLoginTest {
    public void logout() throws InterruptedException {
        login();


        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(10000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoutButton);
        logoutButton.click();


        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/";

        if (currentUrl.equals(expectedUrl)) {
            System.out.println("User successfully logged out! Test passed.");
        } else {
            System.out.println("Test failed! Still on: " + currentUrl);
        }
        teardown();
    }

}
