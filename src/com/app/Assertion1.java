package com.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	WebDriver driver;
	
	@Test
	public void testcase1() throws Exception{
		
		String expectedvalidation="Sorry, we don't recognize this email.";
		
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()mmethod
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//opeening a url by using get method
		driver.get("https://login.yahoo.com/");
		
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('login-signin').click()");
		
		Thread.sleep(3000);
		String actualValidation = driver.findElement(By.id("username-error")).getText();
		
		Assert.assertEquals(actualValidation, expectedvalidation);
		System.out.println("Equal assertion successfully validated" );
		
		Thread.sleep(3000);
		
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("False Assertion successfully validated.");
		
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("true validation successfully validated.");
		
				
	}
	
	
}
