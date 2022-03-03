package com.app;

public class Inheritance4 extends Inheritance3 {
	
	public void multiplication(int x,int y){
		
		
		z=x*y;
		
		System.out.println("Multi is:"+z);
		
		
	}
public static void main(String[] args) {
	int x=10,y=20;
	
	Inheritance4 i4= new Inheritance4();
	
	i4.addition(x, y);
	i4.addition(20, 15);
	i4.multiplication(40,18);
	i4.multiplication(x, y);
	
	
	
	
}	

}
