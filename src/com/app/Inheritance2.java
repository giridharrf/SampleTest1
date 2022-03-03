package com.app;

public class Inheritance2 extends Inheritance1 {
	
	String s= "Selinium";//global var
	
	String college="BITS";
	
	
	
	public static void main(String[] args) {
		
		Inheritance2 i2=new Inheritance2();
		
		System.out.println(i2.roll);
		
		System.out.println(i2.s);
		System.out.println(i2.college);
		
	}

}
