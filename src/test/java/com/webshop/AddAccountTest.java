package com.webshop;

import com.webshop.models.User;
import com.webshop.utils.DataProviders;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class AddAccountTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();

        }
    }

    @Test
    public void addAccountPositiveTestFromDataProvider() {
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;
        app.getUser().click(By.cssSelector("[href='/register']"));
        app.getUser().type(By.id("FirstName"), "Vasja");
        app.getUser().type(By.id("LastName"), "Vasilev");
        app.getUser().type(By.id("Email"), "vasjsav" + i + "@gmail.com");
        app.getUser().type(By.id("Password"), "Vasjasav$123");
        app.getUser().type(By.id("ConfirmPassword"), "Vasjasav$123");
        Assert.assertTrue(app.getUser().isElementPresent(By.id("register-button")));
    }



    @Test(dataProvider = "regNewUserFromCsvFile", dataProviderClass = DataProviders.class)
    public void regUserPositiveTestFromDataProviderWithCsvFile(User user) {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(user);
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isContinueLinkPresent());
    }

    }


