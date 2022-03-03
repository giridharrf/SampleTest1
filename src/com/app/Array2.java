package com.app;

public class Array2 {
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};
		
		String s[]= {"Hi","Hello"};
		
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(s.length);
		System.out.println(s[0]);
		
		
		a[4]=100;//modifiying array val using index
		
		System.out.println(a[4]);
	}

}
