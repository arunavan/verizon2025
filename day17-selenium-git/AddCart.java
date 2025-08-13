package com.verizon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddCart {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.saucedemo.com/");

            // Login (example site)
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for inventory page to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_item")));

            // Click "Add to cart" for the first product
            WebElement addToCartBtn = driver.findElement(By.cssSelector(".inventory_item:first-of-type button"));
            addToCartBtn.click();

            // Wait for cart badge to appear without fixed wait
            WebElement cartBadge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_badge")));

            // Verify cart badge text is '1'
            if ("1".equals(cartBadge.getText())) {
                System.out.println(" Item successfully added to cart. Cart badge shows 1.");
            } else {
                System.out.println(" Cart badge value is incorrect: " + cartBadge.getText());
            }

        } finally {
          //  driver.quit();
        }
    }
}
