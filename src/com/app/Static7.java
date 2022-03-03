package com.app;

public class Static7 {
	
String a;
int b;
static int c=4;

public static void main(String[] args) {
	Static7 s7=new Static7();
	s7.a="Selinium";
	
	s7.b=1;
	
	c=2;
	a();
	System.out.println(s7.a+" "+s7.b+" "+c);
}

public static void a(){
	
	System.out.println("Hello static");
	
	
}

}
