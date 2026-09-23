package com.demo.arrys;

public class EmployeeDemo {
public static void main(String[] args) {
	
	Employee e= new  Employee(123, "keerthi");
	Employee e1= new Employee(833, "suresh");
	Employee e2= new Employee(256, "bahu");
	Employee e3= new Employee(936, "bali");
	Employee e4= new Employee(613, "sena");
	
    Employee emps[]={e,e1,e2,e3,e4};
    
    for(Employee ee:emps)
    {
    	System.out.println(ee);
    }
}
}
