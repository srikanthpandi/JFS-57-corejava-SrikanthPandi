package com.demo.methods;

public class Employee {

	int empid;
	String empname;
	
	public Employee() {
		
		empid=123;
		empname="suresh";
	}
	public void dispaly()
	{
		System.out.println(empid +" "+empname);
	}
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.dispaly();
	}
}
