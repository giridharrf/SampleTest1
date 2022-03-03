package com.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {
	
	WebDriver driver;
	@BeforeClass
	public void setEnv(){
		
	System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()mmethod
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//opeening a url by using get method
		driver.get("https://facebook.com/");
		
	}
	@DataProvider
	
	public String[][] dataSet(){
		
		String arr[][] = new String[2][2];
		
		arr[0][0] = "Email_1";
        arr[0][1] = "Password_1";	
        
        arr[1][0] = "Email_2";
        arr[1][1] = "Password_2";
		
		return arr;
		
		
	}
	
	@Test(dataProvider = "dataSet")
	
	public void enterCredentials(String UserName,String Password) throws Exception{
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='pass']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(UserName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password);
	
	}

}
