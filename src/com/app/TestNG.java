package com.app;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void a1(){
		
		
		System.out.println("a2 test method");
		
	}
	
	@BeforeTest
	public void b(){
		
		System.out.println("Before Test Method");
	}
	
	@BeforeSuite
	public void c(){
		System.out.println("Before Test Suite");
		
	}
	@AfterMethod
	public void d(){
		
		System.out.println("After Method Method");
		
	}
	@BeforeClass
	public void e(){
		System.out.println("Before class ee");
		
	}
	
	@AfterTest
	public void f(){
		
		System.out.println("After class method");
	}
	@AfterClass
	
	public void g(){
		
		System.out.println("After class method");
	}
	@AfterMethod
	public void h(){
		
		System.out.println("aftr method method");
		
	}
	
	@AfterSuite
	
	public void i(){
		
		System.out.println("after suite Method");
	}
	
	@Test
	
	public void a2(){
		
		System.out.println("A2 method");
	}
	public static void main(String[] args) {
		System.out.println("This is a main method");
	}
	

}
