package com.demo.strings;

public class Demo2 {
public static void main(String[] args) {
	
	StringBuilder sb1= new StringBuilder("welcome");
	StringBuilder sb2= new StringBuilder("welcome");
	//sb.append("sleeping");
	
	System.out.println(sb1==sb2);//t f
	System.out.println(sb1.equals(sb2));//f t
}
}
