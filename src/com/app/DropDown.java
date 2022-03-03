package com.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\slinum\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//manage()mmethod
		driver.manage().window().maximize();
		//opeening a url by using get method
		driver.get("https://facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		//1st way
		
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total drop downvalues are:"+birthMonth.size());
		
		birthMonth.get(9).click();

	
		System.out.println(birthMonth.get(1).isEnabled());
		//2nd way
		
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		// Will use Select Class Const
		
		Select month= new Select(bm);
		
		//Select By Visible text
		
		month.selectByVisibleText("Apr");//Apr
		
		month.selectByValue("12");
		
		month.selectByIndex(10);
		// get current val from dropdown
		
		System.out.println(month.getFirstSelectedOption().getText());
		
		//3 rd way- we arev storing all dropdwon value
		
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total DropDwon Vals Are:"+dropdown.size());
		for (int i=0;i< dropdown.size();i++){
			
			String dropdownVals= dropdown.get(i).getText();
			if(dropdownVals.equalsIgnoreCase("Aug")){
				
				dropdown.get(i).click();
				//or
				
				//month.selectByVisibleText(dropdownVals);
				
				
				//4th way - checking the dropdown is checking for multiple selection or not
				
				
				System.out.println(month.isMultiple());//False
				
				month.selectByIndex(2);
				month.selectByIndex(5);
			/*month.deselectByVisibleText("Dec");
				
				month.deselectByIndex(2);//deselcting the selected value
				
				month.deselectByIndex(5);
				
				month.deselectByVisibleText("Dec");
				month.deselectAll();*/
				
				
				//5th way -
				bm.sendKeys("Feb");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
			}
			
		}
	}

}
