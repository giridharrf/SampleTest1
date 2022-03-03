package com.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenShotFailure2 {
	TakeScreenShotFailure1 tc1= new TakeScreenShotFailure1();
	
	public void doLogin() throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		 tc1.driver= new ChromeDriver();
		//manage()mmethod
		tc1.driver.manage().window().maximize();
		tc1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//opeening a url by using get method
		tc1.driver.get("https://facebook.com/");
		Thread.sleep(2000);
		tc1.driver.findElement(By.xpath("//*[@id='email'")).sendKeys("abca2gmail.com");
		tc1.driver.findElement(By.xpath("//*[@id='pass'")).sendKeys("12345");
		
		//passsing wrong id mso that our test case will fail
		tc1.driver.findElement(By.xpath("//*[@id='login_button'")).click();
		

		
	}
	@Test(priority=2)
	public void assertionCheck(){
		
		System.out.println("Assertion check..");
	}
	@AfterMethod
	public void  takeScreenShotOnFailure(ITestResult result) throws Exception{
		tc1.captureScreenShot(result);
		//tc1.driver.quit();
		
		
	}

}
