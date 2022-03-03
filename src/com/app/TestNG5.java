package com.app;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {
	
	//@Test
	public void a(){
		System.out.println("a test method");
		
	}
	@Test(enabled= true)//always recomended as per industry standard
	public void b(){
		System.out.println("b test method");
		
	}

	@Test(invocationCount =2)
	public void c(){
		System.out.println("c test method");
		
	}
	@Test(invocationCount =0)
	
	public void d(){
		
		System.out.println("d method");
	}
	
	@Test
	public void e(){
		System.out.println("e test method");
		throw new SkipException("skipping e method");
		//
	}
}
