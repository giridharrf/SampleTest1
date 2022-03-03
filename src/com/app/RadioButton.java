package com.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButton {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//manage()mmethod
	driver.manage().window().maximize();
	//opeening a url by using get method
	driver.get("https://facebook.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	//1st way It is not a good approach
	/*Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='1']")).click(); //click female radio button
	Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='2']")).click();// click male radio button
    Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='-1']")).click();//click custom radio button
*/
	//2nd way creating list for all radio button
	
	/*
	
	System.out.println("Total radio Buttons::"+radios.size());
	
	
	
	


	
	
	
	System.out.println(radios.get(1).isEnabled());// male radio button is enabled or not
	System.out.println(radios.get(0).isDisplayed());//Female radio button is diaplayed or not

	System.out.println(radios.get(2).isSelected());// Custom Radio Button is selected or not
	Thread.sleep(3000);
	radios.get(1).click();
	Thread.sleep(3000);
	System.out.println(radios.get(2).isSelected());*/
	
	//3 rd way
	
	List<WebElement>  radios = driver.findElements(By.xpath("//input[@name='sex']"));
	
	System.out.println(radios.size());
	
	List<WebElement>  radios1= driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
	System.out.println(radios1.size());
	String expectedResult = "Custom";
	for(int i=0;i<=radios1.size();i++){
		
		if(radios1.get(i).getText().equalsIgnoreCase(expectedResult)){
			
			radios.get(i).click();
			
			
			List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@class='_7-16 _9hk6 _5dba']/option"));
			System.out.println("Total drop downvalues are:"+birthMonth.size());
			
			birthMonth.get(2).click();
			
			System.out.println(birthMonth.get(2).isSelected());
			
			driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Male");
			
			
			System.out.println(expectedResult+"Clicked");
			
			break;
			
			
			
		}
		
		
		
	}
	

	

	
}
}
