package com.java.sessions;

import java.util.Arrays;
import java.util.List;

public class Stream_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=Arrays.asList(78,34,90,124,45,1,34,200);
		System.out.println(" Original List :"+intList);
			System.out.println("Sum :"+intList.stream().
					reduce((a,b)->a+b).get());		
		
	    System.out.println(" Count Of Distinct Entry : "+
		intList.stream().distinct().count());
	    System.out.println("------------print dictict entry----");
	    intList.stream().distinct().forEach(System.out::println);
	    //-------------------------------------
	    System.out.println("----print firt 4 entries from array");	    
	    intList.stream().limit(4).forEach(System.out::println);
	    //-------------------------
	    System.out.println("------------lenth of city----");
	    List<String> cityList=Arrays.asList("Pune","Mumbai",
	    		"","Noida","Pune","","Chennai");
	    cityList.stream().map((city)->{return "City:"+city+ " Length: "+city.
	    		length();}).forEach(System.out::println);	
	    System.out.println("------------city with no names---");
	   System.out.println(
			   cityList.stream().filter((String city)->city.isEmpty()).count());
	    
	}
	



	}

