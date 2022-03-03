
package com.app;

public class Array4 {

	
	public static void main(String[] args) {
		
		//declaration and installation of an multi dimension array
		
		
		int a[][]={{1,2,3,7},{4,5,6,0},{7,8,9,6}};
		
		//Total Row
		
		int row=a.length;//length is the property of an array
		
		System.out.println("Total Rows:"+ row);
		
		
		//Total column
		
		int column= a[0].length;
		
		
		
		System.out.println("Total Column:"+column);
		
		
		
		//print all elements of multi dimension array
		//outer loop
		
		for(int i=0; i<row;i++){

			
			for(int j=0;j<column;j++){
				
				System.out.print(a[i][j]+"     ");
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}
}
