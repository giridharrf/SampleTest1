package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
public static void main(String[] args) throws InterruptedException {
	//settinh yhe proeprty of chrome browser and 
	System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//manage()mmethod
	driver.manage().window().maximize();
	//opeening a url by using get method
	driver.get("https://facebook.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://google.com/");
	//rferesh page
	Thread.sleep(3000);
	driver.navigate().refresh();
	//naqvigate to back
	driver.navigate().back();
	//navigate to forward
	Thread.sleep(3000);
	driver.navigate().forward();
	
	//naqvigate to back
	//	driver.navigate().back();
		
		//getting current url
		
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		
		
		System.out.println(url);
		// getting title of web page
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		/*WebElement samplexpath = driver.findElement(By.xpath("//input[@id='email']"));
		
		samplexpath.click();*/
		
		//close the current browser instance
		
		Thread.sleep(3000);
		driver.close();
		
		
		//close all browser instance
		/*
				Thread.sleep(3000);
				driver.quit();
				*/
		
		
}
}
