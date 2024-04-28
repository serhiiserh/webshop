package com.webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTrainingTest extends TestBase{

    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(isHomeComponentPresent());
    }

    public boolean isHomeComponentPresent() {
        return app.getUser().isElementPresent(By.cssSelector(".header-logo"));
    }

    @Test
    public void findElementByTageName(){
        WebElement element_h3 = app.getUser().driver.findElement(By.tagName("h3"));
        System.out.println(element_h3.getText());
        WebElement element_li = app.getUser().driver.findElement(By.tagName("li"));
        System.out.println(element_li.getText());
    }


}


