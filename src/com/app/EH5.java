package com.app;

public class EH5 {
	public static void main(String[] args) {
		String y = "Hello";
		String x="selinium";
		
		try {
			int a=Integer.parseInt(x);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("hELLO SELINIUM..");
		}
		
	}

}
