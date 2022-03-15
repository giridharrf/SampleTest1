package com.app;

public class EH9 {
public static void main(String[] args) {
	
	try {
		int a=20/2;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		System.out.println("it will exxexute always Non ");
	}
	
}
}
