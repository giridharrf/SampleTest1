package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ObjectRepository {
	
	public static void main(String[] args) throws IOException {
		
		//specify the location of property file.
		File src = new File("D:\\Sai\\Registration\\Repository\\Object_repo.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		
		Properties pro = new Properties();
		pro.load(fis);
		
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()mmethod
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");
		
		
		
		//get property() methods returns the key same key
		
		driver.findElement(By.xpath(pro.getProperty("EmailorPhone"))).sendKeys("abc@email.com");
		driver.findElement(By.xpath(pro.getProperty("password"))).sendKeys("12345");
	}

}
