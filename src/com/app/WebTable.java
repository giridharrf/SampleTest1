package com.app;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
		//create list of all companies
		
		List<WebElement> allcompanies= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("all companies:"+allcompanies.size());
		
		List<WebElement> totcurrentprice= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current price::"+totcurrentprice.size());
		
		String expectedCompNam= "Ruby Mills";
		
		for(int i=0;i<allcompanies.size();i++){
			if(allcompanies.get(i).getText().equalsIgnoreCase(expectedCompNam)){
				
				
				System.out.println(allcompanies.get(i).getText()+"......."+totcurrentprice.get(i).getText());
				allcompanies.get(i).getText();
				break;
			}
			
			
			
		}
		
	}

}
