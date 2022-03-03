package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void asertionCheck(){
		
		
		String expectedResult="User created sucessfully.";
		String actualMsg="user created succesfully.";
		try{
		Assert.assertEquals(actualMsg, expectedResult);
		}
		catch (Exception asr) {
      System.out.println(asr);
      //asr.printStackTrace();
}
		System.out.println("verification succesfully");
	}

}
