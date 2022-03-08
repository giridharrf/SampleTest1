package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	
	@Test
	public void testcase4(){
		
		String expectedresult="Google";
		
		String  actualVal="Gooooogleaa";
		
		try{
			
			Assert.assertEquals(actualVal, expectedresult,"ACtula and Expected are not matching");
			
			
		}catch(Exception a){
			a.printStackTrace();
		System.out.println(a);
			
			
			
			
		}
		
		
		
	}
	

}
