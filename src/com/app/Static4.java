package com.app;

public class Static4 {
	
	int roll;//global var
	String name;//global var
	static String college="giri";//global var
	
	
	//Introducing constructor
	
	public Static4(int r, String n) {

	
	roll=r;
	name=n;
	
	
	
	}
	
	public void getResult(){
		
		System.out.println(roll+" "+name+" "+college);
		
	}
	
	

}
