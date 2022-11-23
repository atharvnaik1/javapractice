package com.pattern;

import java.util.Scanner;
import java.lang.Math;

public class salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
int basicsalary = s.nextInt();
double hra =  0.2 * basicsalary;
double da = 0.5 * basicsalary ;
double pf = 0.11* basicsalary ;
double allowance ;

char grade = s.next().charAt(0);

if (grade=='A') {
	allowance = 1700;
}

else if (grade =='B')
{
	allowance = 1500;
	
}
else {
	allowance =1300;
}
double Salary = basicsalary + hra + da + allowance - pf ;

int Total = (int)Math.round(Salary);

System.out.println(Total);



	}
	
		
	}


