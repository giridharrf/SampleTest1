package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testCase2(){
		
		int a=10;
		int b=20;
		
		
		
		String  expectedTitle="Googles";
		
		String actualTitle="Gooooogles";
		try{
		
		Assert.assertEquals(expectedTitle, actualTitle,"Actual and Exdpected are not matching");
		}catch(AssertionError error){
			error.printStackTrace();
			System.out.println(error);
			
			
		}
		Assert.assertFalse(a > b,"Assert False condition gets Failded.");
		System.out.println("bale bale");
		
		Assert.assertTrue(a > b  ,"tets case failed as b is greater than a");
		
	}
	@Test
	
	public void testcase3(){
		System.out.println("Hello assertion..");
		
		
	}
	
}
