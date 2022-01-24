package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Collections {

	public static void main(String[] args) {
		
		HashMap<Integer,String> Hmap = new HashMap<Integer,String>();
		
		Hmap.put(1, "sedan");
		Hmap.put(2, "volvo");
		Hmap.put(3, "Bmw");
		
		System.out.println("Displaying Hashmap in an array" + Hmap);
		
		for(Entry<Integer, String> m : Hmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		

	}

}
