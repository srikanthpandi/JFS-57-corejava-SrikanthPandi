package com.demo.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class AryGen {
public static void main(String[] args) {
	
	ArrayList<String> al= new ArrayList<String>();
	 al.add("bahubali");
	 al.add("devasena");
	 al.add("ballala");
	 al.add("bijjaladeva");
	 
	 System.out.println(al);
	 
	 ListIterator<String> itr=al.listIterator();
	 
	 while(itr.hasNext())
	 {
		 //System.out.println(itr.next());
		 if(itr.next().contains("bahubali"))
		 {
			// itr.remove();
			 itr.set("kattappa");
		 }
	 }
	 
	 for(String st:al)
	 {
		 System.out.println(st);
	 }
	 
	 System.out.println("------------reverse-------");
	 
	 while(itr.hasPrevious())
	 {
		 System.out.println(itr.previous());
	 }
}
}
