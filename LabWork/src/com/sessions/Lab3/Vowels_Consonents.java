package com.sessions.Lab3;

import java.util.Scanner;

class Alphabets{
		
		private static final String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
		private int consLength = consonants.length();
		
		public String alterString(String str) {
			
			int index;
			char[] charArray = str.toCharArray();
			for(int i=0;i<charArray.length;i++) {
				index = consonants.indexOf(charArray[i]);
				if(index != -1) {
					charArray[i] = consonants.charAt((index + 1) % consLength); //9 % 21
				}
			}
			return new String(charArray);
		}
	}
	
public class Vowels_Consonents {
	
	public static void main(String[] args) {
		
		String stringInput;
		Scanner sc = new Scanner(System.in);
		Alphabets convert = new Alphabets();
		
		System.out.print("Enter the String value : ");
		stringInput = sc.nextLine();
		
		System.out.println("After altering String : "+convert.alterString(stringInput.toUpperCase()));
	}

		

	}


