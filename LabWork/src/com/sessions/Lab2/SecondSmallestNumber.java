package com.sessions.Lab2;

import java.util.Arrays;

public class SecondSmallestNumber {
	
	public static int getSecond(int a[]) {
		Arrays.sort(a);
		return a[1];
	}
		
	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5};
		int b[] = {45,77,12,8,44};
		
		
		System.out.println("second smallest number in the array a is "+ getSecond(a) );
		System.out.println("second smallest number in the array b  is "+ getSecond(b) );
		
		
	}
	

}
