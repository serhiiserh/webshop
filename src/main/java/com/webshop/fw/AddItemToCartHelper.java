package com.webshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemToCartHelper extends BaseHelper{
    public AddItemToCartHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLaptopLink() {
        
        driver.findElement(By.cssSelector(".item-box:nth-child(3)")).click();
    }

    public void clickOnAddCartButton() {
        driver.findElement(By.id("add-to-cart-button-31")).click();
    }

    public void clickOnShoppingCart() {
        driver.findElement(By.cssSelector(".cart-label")).click();
    }

    public boolean quantityInCart(){
        return isElementPresent(By.cssSelector(".qty-input"));
    }



}
