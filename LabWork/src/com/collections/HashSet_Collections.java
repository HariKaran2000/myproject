package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Collections {

	public static void main(String[] args) {
		//set uses unique values and no duplicate values will be here
		//we can't predict the order here it is unordered
		
		Set<String> Hset = new HashSet<String>();
		Hset.add("chicken");
		Hset.add("mutton");
		Hset.add("beef");
		Hset.add("fish");
		Hset.add("pork");
		Hset.add("shrimp");
		
		System.out.println("The List of Non veg items Available are : " );
		System.out.println();
		
		Iterator<String> itr = Hset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		HashSet<String> Hset1 = new HashSet<String>();
		
		Hset1.add("Rice");
		Hset1.add("Roti");
		Hset1.add("Dosa");
		
		
		System.out.println("The Veg items that are available are ");
		System.out.println();
		Iterator<String> itr2 = Hset1.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		
		Hset.addAll(Hset1);
		
		System.out.println();
		System.out.println("After merging both set " );
		System.out.println();
		
		Iterator<String> itr1 = Hset.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
