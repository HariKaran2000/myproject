package com.sessions.Lab5;

import java.util.Scanner;


class EmployeeException extends Exception{

	public EmployeeException(String message) {
		super(message);
		
	}
	
}

public class Employee_Salary {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary of the Employee : ");
		int salary = sc.nextInt();
		
		try {
			if(salary < 3000) {
				throw new EmployeeException("Sorry! Salary should be above 3000...");
			}
			else {
				System.out.println("Employee Salary is : "+salary);
			}
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}
	}

}
