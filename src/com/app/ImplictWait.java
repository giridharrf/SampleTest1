package com.app;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()mmethod
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("How stuff works");
	
		
		WebElement allSuggestions= driver.findElement(By.xpath("//*[@role='listbox']"));
		
		
		List<WebElement>  allserach= allSuggestions.findElements(By.tagName("li"));
		System.out.println("Total suggestions:"+allserach.size());
		
		
		
		for(int i=0;i<allserach.size();i++){
			
			
			
			
			String allsuggestionslist= allserach.get(i).getText();
			String finalResult="How stuf work book";
			
			if(allsuggestionslist.equalsIgnoreCase(finalResult)){
				
				allserach.get(i).click();
				System.out.println("you have selected:"+finalResult);
				break;
				
				
				
			}
			
			
			
			
			
		}
		
		
		
}
}
