package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	int emp_id;
	String emp_name;
	int age;
	
	Employee(int emp_id,String emp_name,int age){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.age=age;
	}
}
	public class ArrayList_Employee {

		public static void main(String[] args) {
// TODO Auto-generated method stub
			Employee e1=new Employee(101,"Sonoo",23);
			Employee e2=new Employee(102,"Ravi",21);
			Employee e3=new Employee(103,"Hanumat",25);
			ArrayList<Employee> al=new ArrayList<Employee>();
			
			al.add(e1);
			al.add(e2);
			al.add(e3);
			
			
			Iterator itr=al.iterator();
			while(itr.hasNext()){
			Employee et=(Employee)itr.next();
			System.out.println(et.emp_id+" "+et.emp_name+" "+et.age);
			}
			
			
			
		}
	}