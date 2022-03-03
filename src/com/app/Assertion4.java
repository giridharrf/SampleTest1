package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 {
	
	@Test
	public void tesdtcase5(){
		
		
		int i=30;
		int j=30;
		
		try{
		Assert.assertTrue(i > j);
		}catch(AssertionError asrr){
			System.out.println(asrr);
			
		}
		
		System.out.println("asertion fail");
		
		
		if(i==j){
			
			System.out.println("test aces pass");
			
			
			
		}else {
			System.out.println("test case is failed");
		}
		
		
		
	}

}
