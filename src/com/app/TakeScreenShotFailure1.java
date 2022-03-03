package com.app;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;



	
public class TakeScreenShotFailure1 {
	
	WebDriver driver;
	
	
	public void captureScreenShot(ITestResult result) throws Exception{
		
		if(ITestResult.FAILURE == result.getStatus());
		
			//creating a refernce screen shot interface and type casting
		
		  
		TakesScreenshot ts= (TakesScreenshot) driver;//type casting of interface
		
		//File source= (File) ts.getScreenshotAs(OutputType.FILE);
		
		// get the screen shot method return type as File.
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		
		//copy the file to specific location
		
		FileUtils.copyFile(source, new File("./ScreenShot/"+result.getName()+".png"));
		
		
		System.out.println(result.getName()+"Screen shot Method() get captured..");
		
		
		
		
		
		
		
		
		
		
			
			
		}
		
	}


