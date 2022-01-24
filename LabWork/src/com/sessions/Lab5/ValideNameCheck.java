package com.sessions.Lab5;

import java.util.Scanner;

class ValidateName extends Exception{
	
	ValidateName(String str){
		System.out.println(str);
	}
}

public class ValideNameCheck {
public static void main(String[] args) {
		
		String fname,Lname;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Name : ");
		fname = sc.nextLine();
		System.out.print("Enter your Last Name : ");
		Lname = sc.nextLine();
		
		try {
			if(fname==""||Lname=="") {
				String errorField = fname=="" ? "First Name" : "Last Name";
				throw new ValidateName(errorField+" can't be blank Try again...");
			}
			else {
				System.out.println("Your FullName is : "+fname+Lname);
			}
		}
		catch(ValidateName name) {
			System.out.println(name);
		}
	}

}
