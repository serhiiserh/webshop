package com.webshop;

import com.webshop.data.UserData;
import com.webshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase {

    @BeforeMethod
    public void loginToAccount() {
        if (app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();


    }

    @Test
    public void addItemToCartTestWithMessage() {
        app.getUser().pause(500);
        app.getItem().clickOnLaptopLink();
        app.getItem().clickOnAddCartButton();
        app.getUser().pause(500);
        app.getItem().clickOnShoppingCart();
       Assert.assertTrue(app.getItem().quantityInCart());
    }



}
