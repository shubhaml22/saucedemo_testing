package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class sortProduct extends ValidLoginTest{
    public void s_product(){
        login();
        WebElement dropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));

        Select select=new Select(dropdown);
//        select.selectByValue("lohi");
        select.selectByValue("hilo");

    }
}
