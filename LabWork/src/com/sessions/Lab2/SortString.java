package com.sessions.Lab2;

import java.util.Arrays;
import java.util.Scanner;

class Test3{
	public String sortStrings(String[] arr) {
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
}

public class SortString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+i+" index element : ");
        	arr[i] = sc.next();
		}
		Test3 t = new Test3();
		t.sortStrings(arr);
		System.out.println("Sorted Strings are : "+t.sortStrings(arr));
	}

}