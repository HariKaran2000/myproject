package com.sessions.Lab3;

import java.util.Scanner;

class Mirror{
	
	public String getImage(String str) {
		
		StringBuffer Sb = new StringBuffer(str); 
		
		Sb.append("|"); // Hari |
		
		StringBuffer Sb1 = new StringBuffer(str);
		
		Sb1.reverse(); // irah 
		
		Sb.append(Sb1);  // Hari | irah
		
		return Sb.toString();
		
	}
}

public class MirrorImage {

	public static void main(String[] args) {
		
		Mirror MImg = new Mirror();
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter a String to Mirror : ");
        String str = s.next();
        
        System.out.println("Mirrored String is : " +MImg.getImage(str));
		
		
		

	}

}
