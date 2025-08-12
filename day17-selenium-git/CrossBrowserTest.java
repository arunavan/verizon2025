package com.verizon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class CrossBrowserTest {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
         
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
          
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testA1() {
        driver.get("https://example.com");
        String pageTitle = driver.getTitle();
        System.out.println("A1 Scenario: Page Title = " + pageTitle);
        Assert.assertTrue(pageTitle.contains("Example"), "Title does not match expected text!");
    }

    @Test
    public void testA2() {
        driver.get("https://www.selenium.dev/");
        String pageHeading = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println("A2 Scenario: Heading = " + pageHeading);
        Assert.assertTrue(pageHeading.contains("Selenium"), "Heading does not match expected text!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
