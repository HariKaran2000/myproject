package com.sessions.Lab1;

import java.util.Scanner;

class NaturalNum{
	public int calcSum(int n) {
		int sum=0;
		for(int i=1;i<n+1;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return(sum);
	}
}

public class NaturalNum_Calculator {
	public static void main(String[] args) {
		NaturalNum ns = new NaturalNum();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		System.out.println("Sum of "+num+" natural numbers divisible by 3 or 5 are : "+ns.calcSum(num));
	}

}
