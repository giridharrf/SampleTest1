package com.app;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class EH10 {
	public static void eligible(int age){
		
		try{
		if(age < 18){

			throw new ArithmeticException("Not valid");
			
		}else {
			System.out.println("Eligible for vcoting");
		}
	}catch(Exception e){
		
		e.printStackTrace();
	}
	}
		
		
	public static void main(String[] args) throws InterruptedException,NullPointerException,Exception{
		
		Thread.sleep(3000);
		eligible(19);
		eligible(20);
		
		
	}
		
	}

