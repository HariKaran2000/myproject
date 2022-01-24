package com.sessions.Lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
		
		
	}

}
