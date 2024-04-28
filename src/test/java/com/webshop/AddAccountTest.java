package com.webshop;

import com.webshop.models.User;
import com.webshop.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AddAccountTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();

        }
    }

    @Test(dataProvider = "regNewUserFromCsvFile", dataProviderClass = DataProviders.class)
    public void regUserPositiveTestFromDataProviderWithCsvFile(User user) {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(user);
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isContinueLinkPresent());
    }

    }


