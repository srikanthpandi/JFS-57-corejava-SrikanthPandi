package com.demo.blocks.interfaces;

interface Employee{
	 void work();
	 static void companyname() {
		 System.out.println("codegnan company");
	 }
}
class Developer implements Employee{
	@Override
	public void work() {
		System.out.print("Handling some issuess in ");
	}
}

public class Company {
	public static void main(String[] args) {
		Developer d=new Developer();
		d.work();
		Employee.companyname();
	}
}
