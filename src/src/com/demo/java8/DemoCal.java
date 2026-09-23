package com.demo.java8;

interface Calculator{
	public int  add(int a , int b) ;
}
public class DemoCal {
	public static void main(String[] args) {
//		
//		  Calculator cal=new Calculator(){
//		  
//		  @Override public int add(int a, int b) { return 0; }
//		  
//		  };

	Calculator cal1=(a,b)->{return a+b;};
	System.out.println(cal1.add(12, 13));
	
	}
}