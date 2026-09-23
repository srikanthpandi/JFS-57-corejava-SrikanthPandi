package com.demo.arrys;

public class Employee {

	int empid;
	String empname;
	public Employee(int empid, String empname) {
		
		this.empid = empid;
		this.empname = empname;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
	
}
