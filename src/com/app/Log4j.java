package com.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	public static void main(String[] args) {
		//we need to create logger instance so we need pass class name, to write log file
		
		//org.apache.log4j.Logger logger =new org.apache.log4j.Logger.
		
		com.sun.javafx.logging.Logger logger = new com.sun.javafx.logging.Logger();
		
		logger.addMessage("log4");
		
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()mmethod
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		logger.addMessage("Implicit Wait given");
		
		driver.get("https://facebook.com");
		logger.addMessage("fb app opened");

		
		
		
	}

}
