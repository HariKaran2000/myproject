package com.sessions.Lab1;

import java.util.Scanner;

class Calculate {
	public int CubeOfDigits(int num) {
		int data, temp, sum = 0;
		temp = num;
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, 3);
			temp /= 10;
		}
		return sum;
	}
}

public class Calculator {

	public static void main(String[] args) {
		
		int num;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number : ");
        num = console.nextInt();
        Calculate cal = new Calculate();
        System.out.println("Sum of Cube of digits for "+num+" is : "+cal.CubeOfDigits(num));
	}

}
