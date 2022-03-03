package com.app;

public class EH3 {
public static void main(String[] args) {
	try{
	int a=10/0;
	}catch (ArithmeticException e) {
     System.out.println(e);	

	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
