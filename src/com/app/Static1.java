package com.app;

public class Static1 {
	
	static int z=5;//static variable
	
	int y=1;//non-static variable
	
	public static void main(String[] args) {
		a();
		
		Static1 s1= new Static1();
		s1.b();
		
	}
	
	//static method
	public static void a(){
		
		int z=15;
		System.out.println("a method called z:"+z);
	}

	//non-static method
	public void b(){
		
		int z=15;
		a();
	}
}
