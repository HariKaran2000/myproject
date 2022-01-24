package com.collections;

import java.util.ArrayList;

public class ArrayList_string {
	public static void main(String[] args) {
	ArrayList<String> ArrStr = new ArrayList<String>();
	ArrStr.add("football");
	ArrStr.add("Basketball");
	ArrStr.add("cricket");
	ArrStr.add("badminton");
	System.out.print("String in an order");
	System.out.println(ArrStr);
	System.out.println();
	
	System.out.println("Printing Separately");
	
	for (String i : ArrStr) {
		
	System.out.println(i);
	}

}
}