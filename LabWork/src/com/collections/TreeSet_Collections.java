package com.collections;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Collections {

	public static void main(String[] args) {
		
		TreeSet<Integer> intSet=new TreeSet<Integer>();
		 intSet.add(30);
		 intSet.add(80);
		 intSet.add(100);
		 intSet.add(30);
		 intSet.add(1);
		 intSet.add(78);
		 System.out.println(intSet);
		 Iterator<Integer> intIt= intSet.iterator();
		 while(intIt.hasNext())
		 {
			 	System.out.print(intIt.next() + "- ");			 
		 }	
		 //------------------EmpSet---------------------
		 TreeSet<Employee> empSet=new TreeSet<Employee>();
//		 empSet.add(new Employee(789,"vaishali",3000.0F,'F',new Date()));
//		 empSet.add(new Employee(111,"Richa",1000.0F,'F',new Date()));
//		 empSet.add(new Employee(333,"Rishab",45000.0F,'M',new Date()));
//		 empSet.add(new Employee(222,"Devasri",33000.0F,'F',new Date()));
//		 empSet.add(new Employee(666,"Pradip",67000.0F,'M',new Date()));
//		 empSet.add(new Employee(789,"vaishali",3000.0F,'F',new Date()));
//		 System.out.println("-----------------------");
		// System.out.println(empSet);
		 Iterator<Employee> empIt= empSet.iterator();
		 while(empIt.hasNext())
		 {
			 	System.out.println(empIt.next() + "- ");			 
		 }	
		}

	}


