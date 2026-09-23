package com.demo.methods;

public class Student {
	int stid;
	String stname;

	// to initilize
	public void assign() {
		stid = 345;
		stname = "keerthi";
	}
	 //to call 
	public void dispaly()
	{
		System.out.println(stid+"  "+stname);
	}
	
	public static void main(String[] args) {
		
		Student  st= new Student();
		st.assign();//
		st.dispaly();
		
	}
}
