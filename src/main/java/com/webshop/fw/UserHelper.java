package com.webshop.fw;

import com.webshop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{


    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void fillLoginForm(User user) {
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
    }

    public void fillRegisterForm(User user) {

        type(By.id("FirstName"), user.getFirstName());
        type(By.id("LastName"), user.getLastName());
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getConfirm_pass());
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".button-1.login-button"));
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public boolean isLoginLinkPresent() {
        return !isElementPresent(By.cssSelector("[href='/login']"));
    }

    public boolean isContinueLinkPresent() {
        return isElementPresent(By.cssSelector(".button-1.register-continue-button"));
    }

    public void clickOnSignOutButton() {
        click(By.cssSelector("[href='/logout']"));
    }
}
