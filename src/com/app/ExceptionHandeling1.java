package com.app;

public class ExceptionHandeling1 {
	public static void main(String[] args) {
		
		try{
		int data=50/0;  //aritmetic exception
		}catch(ArrayIndexOutOfBoundsException ex){
			
			System.out.println(ex);
		}
		catch(NullPointerException nullEx){
			System.out.println(nullEx);
		}
		catch (Exception e) {
     e.printStackTrace();
}
		try{
		int b=10/0;
		
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			System.out.println("finaly will always excuted.");
		}
	}
	
	

}
