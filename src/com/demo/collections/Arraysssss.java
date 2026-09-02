package com.demo.collections;

import java.util.ArrayList;

public class Arraysssss {
public static void main(String[] args) {
	
	ArrayList al= new ArrayList();
	
	for (int i = 0; i <=10; i++) {
		al.add(i);
	}
	
	//for each loop-->odd numbers
	for(Object i:al)
	{
		Integer od=(Integer) i;
		if(od%2!=0)
		{
			System.out.println(i);
		}
	}
}
}
