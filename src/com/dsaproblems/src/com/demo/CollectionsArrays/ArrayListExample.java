package com.demo.CollectionsArrays;

import java.util.*;


public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList a1=new ArrayList();
		//LinkedList a1=new LinkedList();
		Vector a1=new Vector();
		//Stack a1=new Stack();
		
		System.out.println("Initital Capacity "+ a1.capacity());
		System.out.println("Initial size "+a1.size());
		
		a1.add("Baahubali");
		a1.add("Devasena");
		a1.add('A');
		a1.add(254);
		a1.add(56.34);
		a1.add(true);
		a1.add("Kattappa");
		a1.add(null);
		a1.add("Magadheera");
		a1.add("mitravinda");
		
		
		System.out.println("\nVector: "+a1);
		
		System.out.println("Final capacity "+a1.capacity());
		System.out.println("final size "+a1.size());
		
		
		
		ArrayList<String> a2=new ArrayList();
		a2.add("Baahubali");
		a2.add("Devasena");
		a2.add("Balla");
		a2.add("Kattappa");
		
		
		System.out.println("\nArrayList: "+a2);
		
		ListIterator<String> ltr=a2.listIterator();
		
		while(ltr.hasNext()) {
			if(ltr.next().contains("Baahubali")) {
				ltr.set("Baahubali 2");
			}
		}
		System.out.println("\nUpdated ArrayList :"+a2);
		
		
		LinkedList a3=new LinkedList();
		a3.add("Baahu");
		a3.add("Deva");
		a3.add("Billa");
		a3.add("Katta");
		a3.add('A');
		a3.add(254);
		a3.add(56.34);
		a3.add(true);
		
		System.out.println("\nLinkedList: "+a3);

	}

}
