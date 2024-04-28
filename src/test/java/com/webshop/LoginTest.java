package com.webshop;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void loginPositiveTest(){
        app.getUser().clickOnLoginLink();
        // enter email
        app.getUser().type(By.id("Email"), "ecevarriahoma@gmail.com");
        // enter password
        app.getUser().type(By.id("Password"), "ecevarriahoma1234$");
        app.getUser().click(By.cssSelector(".button-1.register-button"));

    }

}
