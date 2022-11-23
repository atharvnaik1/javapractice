package com.pattern;
import java.util.Scanner;

public class sumevenodd {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int digit ; 
		 int SumEven = 0,SumOdd =0;
		while (n>0)
		{
			digit=n%10;
			n=n/10;
			
			if(digit%2!=0)
				SumOdd +=digit;
			else
				SumEven+=digit;
			
		}
		
		System.out.print(SumEven+" "+SumOdd);
		
		
	}

}
// make 3 columns update 1st n , n = n/10 in 2nd ,3rd as digit/remainder = n%10.. 