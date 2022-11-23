package com.pattern;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5; 
		
		for (int i = 0;i<=2 * n;i++) {
			int totalcolumnsinrow = i>n?2*n-i:i;
			for (int j =0; j<totalcolumnsinrow;j++)	{
			System.out.print("*");
			
		}
			System.out.println();
		}
			
	
	}

}

