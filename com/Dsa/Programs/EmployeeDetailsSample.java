package com.Dsa.Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class EmployeeDetailsSample{
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte experience=0;
		short departmentId=0;
		int employeeId=0;
		long mobileNum=0;
		float height=0;
		double salary=0;
		boolean filePresent=false;
		BigInteger aadar=BigInteger.ZERO;
		BigInteger bonus=BigInteger.ZERO;
		 
		String employeesurname="";
		String employeeFullname="";
		
		char maritalStatus=' ';
		
		//Employee_Id
		System.out.println("Enter Employee ID:");
		
			if(sc.hasNext()) {
				employeeId=sc.nextInt();
			}
			else {
				System.out.println("Employee Id is invalid");
				return;
			}
		//employee_name
			System.out.println("Enter employee Name");
			if(sc.hasNext()) {
				employeesurname=sc.next();
			}
			else {
				System.out.println("Employee name is invalid");
			}
		//employee_mobile_number
            System.out.println("Enter employee mobile number");
            if(sc.hasNext()) {
                mobileNum=sc.nextLong();
            }
            else {
                System.out.println("Employee mobile number is invalid");
            }
        //employee_salary
            System.out.println("Enter employee salary");
            if(sc.hasNext()) {
                salary=sc.nextDouble();
            }
            else {
                System.out.println("Employee salary is invalid");
            }
        //employee_department_id
            System.out.println("Enter employee department id");
            if(sc.hasNext()) {
                departmentId=sc.nextShort();
            }
            else {
                System.out.println("Employee department id is invalid");
            }
        //employee_experience
            System.out.println("Enter employee experience");
            if(sc.hasNext()) {
                experience=sc.nextByte();
            }
            else {
                System.out.println("Employee experience is invalid");
            }
            //employee_height
            System.out.println("Enter employee height");
            if(sc.hasNext()) {
                height=sc.nextFloat();
            }
            else {
                System.out.println("Employee height is invalid");
            }
            //employee_marital_status
            System.out.println("Enter employee marital status");
            if(sc.hasNext()) {
                maritalStatus=sc.next().charAt(0);
            }
            else {
                System.out.println("Employee marital status is invalid");
            }
            //employee_aadar_number
            System.out.println("Enter employee aadar number");
            if(sc.hasNext()) {
                aadar=sc.nextBigInteger();
            }
            else {
                System.out.println("Employee aadar number is invalid");
            }
            //employee_bonus
            System.out.println("Enter employee bonus");
            if(sc.hasNext()) {
                bonus=sc.nextBigInteger();
            }
            else {
                System.out.println("Employee bonus is invalid");
            }
            //employee_file_present
            System.out.println("Enter employee file present");
            if(sc.hasNext()) {
                filePresent=sc.nextBoolean();
            }
            else {
                System.out.println("Employee file present is invalid");
            }
            //employee_full_name
            System.out.println("Enter employee full name");
            if(sc.hasNext()) {
                employeeFullname=sc.next();
            }
            else {
                System.out.println("Employee full name is invalid");
            }
            //displaying employee details
            System.out.println("=======================");
            System.out.println("	EMPLOYEE DETILS");
            System.out.println("=======================");
            System.out.println("Employee Department ID: "+departmentId);
            System.out.println("Employee ID: "+employeeId);
            System.out.println("Employee Name: "+employeesurname);
            System.out.println("Employee Full Name: "+employeeFullname);
            System.out.println("Employee Mobile Number: "+mobileNum);
            System.out.println("Employee Salary: "+salary);
            System.out.println("Employee Department ID: "+departmentId);
            System.out.println("Employee Experience: "+experience);
            System.out.println("Employee Height: "+height);
            System.out.println("Employee Marital Status: "+maritalStatus);
            System.out.println("Employee Aadar Number: "+aadar);
            System.out.println("Employee Bonus: "+bonus);
            System.out.println("Employee File Present: "+filePresent);
		
		sc.close();
	}
}
