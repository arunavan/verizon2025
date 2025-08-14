package com.verizon;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App2 {

	
	    public static void main(String[] args) {
	         WebDriver driver = new ChromeDriver();
	       

	        try {
	            driver.get("https://www.geeksforgeeks.org/");

	           String pageTitle = driver.getTitle();
	            System.out.println("Page Title: " + pageTitle);

	            // Wait for a few seconds (for demonstration purposes only)
	            
	            driver.manage().window().maximize();
	            driver.manage().deleteAllCookies();
	            
	          //  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	          //    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     
	            String  tagName = driver.findElement(By.id("__NEXT_DATA__")).getTagName();
	            System.out.println("tag name:"+tagName);
	            
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } 
	        finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}
