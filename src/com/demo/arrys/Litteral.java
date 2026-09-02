package com.demo.arrys;

public class Litteral {
public static void main(String[] args) {
	
	String names[]= {"bahubali","devasena","ballala","kattapa"};
	
//	System.out.println(names[0]);
//	System.out.println(names[1]);
//	System.out.println(names[2]);
//	System.out.println(names[3]);
	
	//for loop 
	
//	for (int i = 0; i <=names.length-1; i++) {
//		System.out.println(names[i]);
//	}
	
	//enhaced for loop 
	
	for(String st :names)
	{
		System.out.println(st);
	}
	
}
}
