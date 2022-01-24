package com.java.sessions;

import java.util.function.BiFunction;

	interface MaxFinder
		{
			public int maximum(int num1,int num2);
		}
	
	
public class Lamda_week3 {

			public static void main(String[] args)
			{
				//MaxFinder mf=(a,b)->{return a>b?a:b;};
				MaxFinder mf=(a,b)->a>b?a:b;;
				System.out.println("Greaset No: " +mf.maximum(89, 39));
				
				BiFunction<Integer,Integer,Integer> biFunction=
						(a,b)-> a>b?a:b;
				System.out.println("Greaset No: " +biFunction.apply(45, 234));
	}
	
	

		}

