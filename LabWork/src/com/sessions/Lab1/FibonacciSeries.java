package com.sessions.Lab1;

import java.util.Scanner;

// non recursive fibonacci

public class FibonacciSeries {
	public static void main(String args[ ]) {
		
		Scanner sc =new Scanner(System.in);
		int i,num1 = 3,num2 = 06,num3=0,temp;
		
		System.out.print("Enter the value :");
		temp=sc.nextInt();
		
		for(i=0;i<temp;i++) {
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
		}
		//System.out.print(temp+" th value of Fibonacci series is: "+num3);

}
}