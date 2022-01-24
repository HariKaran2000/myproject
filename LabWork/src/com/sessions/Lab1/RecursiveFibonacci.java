package com.sessions.Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RecursiveFibonacci {
	
	
	public static void main(String args[])throws IOException {
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.print("Enter the number : ");
		int n=Integer.parseInt(br.readLine());
		Class_fibonacci ob=new Class_fibonacci();
		int res=0;
		for(int i=1;i<=n;i++) {
			res=ob.fib(i);
			System.out.println(" "+res);
		}
		System.out.println();
		System.out.println(n+"th value of Fibonacci series is : "+res);
	}
}