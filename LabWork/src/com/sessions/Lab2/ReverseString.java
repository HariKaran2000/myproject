package com.sessions.Lab2;

import java.util.Arrays;
import java.util.Scanner;

class reverse{
    
    static int reversDigits(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}
	
    public int[] getSorted(int[] arr){
        int rev_arr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev_arr[i] = reversDigits(arr[i]);
        }
        
        Arrays.sort(rev_arr);
        return rev_arr;
    }
}

class ReverseString {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of Array : ");
	    int size = sc.nextInt();
		int arr[] = new int[size];
		reverse t = new reverse();
		
		System.out.println("Before reversed digits sort are below: ");
		for(int i=0;i<arr.length;i++){
		    System.out.print("Enter "+i+" index element : ");
		    arr[i] = sc.nextInt();
		}
       
        System.out.print("After reversed digits sort : ");
        for(int i : t.getSorted(arr)){
           System.out.print(i+" ");
        }
	
	}
}
