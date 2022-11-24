package com.pattern;
import java.util.Scanner ;

public class pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1 ;
		//startingnumber=1 ; for 1,23,456,78910..
		
		while (i<=n)
		{ int j =1 ;
		int startingNumber =i;
		while (j<=i)
		{ 
			System.out.print(startingNumber);
			startingNumber++;
			j++;
			
			
		}
		System.out.println();
		i++;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}