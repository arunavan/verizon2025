package com.verizon;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class CrossBrowserHeadedHeadlessTest {

    WebDriver driver;

    @Parameters({"browser", "mode"})
    @BeforeMethod
    public void setup(@Optional("chrome")String browser,@Optional("mode") String mode) {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (mode.equalsIgnoreCase("headless")) {
                options.addArguments("--headless=new"); // new headless mode
                options.addArguments("--disable-gpu");
            }
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if (mode.equalsIgnoreCase("headless")) {
                options.addArguments("--headless");
            }
            driver = new FirefoxDriver(options);

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
        System.out.println("[" + getBrowserModeInfo() + "] A1 Scenario: Page Title = " + pageTitle);
        Assert.assertTrue(pageTitle.contains("Example"), "Title check failed!");
    }

    @Test
    public void testA2() {
        driver.get("https://www.selenium.dev/");
        String heading = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println("[" + getBrowserModeInfo() + "] A2 Scenario: Heading = " + heading);
        Assert.assertTrue(heading.contains("Selenium"), "Heading check failed!");
    }

    private String getBrowserModeInfo() {
        Capabilities caps = ((HasCapabilities) driver).getCapabilities();
        String browser = caps.getBrowserName();
        String headless = caps.getCapability("headless") != null && (boolean) caps.getCapability("headless") ? "Headless" : "Headed";
        return browser + " - " + headless;
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
