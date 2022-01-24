package com.sessions.Lab5;

import java.util.Scanner;

class AgeException extends Exception{
	
	AgeException(String str){
		System.out.println(str);
	}
	
}


public class Age_Exception {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You're Age : ");
        int age = sc.nextInt();
        
        try {
        	if(age < 18) {
        		throw new AgeException("Oops! Invalid age please enter a valid Age..");
        	}else {
        		System.out.println("The age you Entered is a Valid Age...");
        	}
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
