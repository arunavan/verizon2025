package com.verizon.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.verizon.pages.InventoryPage;
import com.verizon.pages.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = loginPage.loginAs("standard_user", "secret_sauce");

        String title = inventoryPage.getTitle();
        System.out.println("Page title after login: " + title);

        Assert.assertEquals(title, "Products", "Login failed or page title incorrect!");
    }
}