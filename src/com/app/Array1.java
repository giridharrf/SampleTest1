package com.app;

public class Array1 {
	
	public static void main(String[] args) {
		
		
		//Dealaration and instantiation of an array
		
		int a[] = new int[5];
		
		//Initialization
		
		a[3]=1;
		a[1]=3;
		a[2]=5;
		a[0]=7;
		a[4]=9;
		//a[5]=6;// Error -  java.lang.ArrayIndexOutOfBoundsException: 5
		
		System.out.println(a[2]);
		System.out.println("Total Lenth of an array:"+a.length);
		
		//print all array element 
		
		for(int i=0;i<=5;i++ ){
			System.out.println("Array value inex"+i+"IS"+a[i]);
			
			
		}
	}

}
