package com.app;

public class EH8 {
public static void main(String[] args) {
	
	try {
		int a=10/0;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		System.out.println("it will exxexute always");
	}
	
	
}
}
