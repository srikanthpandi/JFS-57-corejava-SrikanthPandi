package com.demo.CollectionsArrays;

import java.util.*;

class Employee {
	int empId;
	String Ename;

	public Employee(int empId, String ename) {
		super();
		this.empId = empId;
		Ename = ename;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}
	
	public String EmployeeInfo() {
		return "Employee ID: " + empId + ", Employee Name: " + Ename;

	}

}

public class EmployeeInfo {
	public static void main(String[] args) {
		
		ArrayList<Employee> a1=new ArrayList();
	
		a1.add(new Employee(101, "Jonny"));
		a1.add(new Employee(102, "Srinu"));

	System.out.println(a1.get(0).EmployeeInfo());
	System.out.println(a1.get(1).EmployeeInfo());



	}
}
