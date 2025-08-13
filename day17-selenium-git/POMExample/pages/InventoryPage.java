package com.verizon.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    // Locator
    private By pageTitle = By.className("title");

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Getter
    public String getTitle() {
        return driver.findElement(pageTitle).getText();
    }
}
