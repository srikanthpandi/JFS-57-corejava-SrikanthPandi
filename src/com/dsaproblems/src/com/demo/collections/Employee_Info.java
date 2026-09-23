package com.demo.collections;

import java.util.ArrayList;

class Employee{	
	int empid;
	String empname;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}	
}
public class Employee_Info {
public static void main(String[] args) {
	
	ArrayList<Employee>  al= new ArrayList();
	 
	al.add(new Employee(123, "bahu"));
	al.add(new Employee(734, "bali"));
	al.add(new Employee(927, "deva"));
	al.add(new Employee(826, "sena"));
	
	for(Employee e:al)
	{
		System.out.println(e.getEmpid()+" "+e.getEmpname());
	}
	
	
	
	
}
}
