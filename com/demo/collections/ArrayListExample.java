package com.demo.collections;

import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList al =new ArrayList();
		// LinkedList al= new LinkedList();
		Vector al = new Vector();
		// Stack al= new Stack();

		System.out.println("initial capacity:" + al.capacity());
		System.out.println("initial size:" + al.size());

		al.add("bahubali");
		al.add("devasena");
		al.add(null);
		al.add(true);
		al.add(56.94);
		al.add(new Integer(549));
		al.add('g');
		al.add("ramesh");
		al.add("suresh");
		al.add("rajesh");
        al.add("11th value");
	System.out.println("final capacity:" + al.capacity());
	System.out.println("final size:" + al.size());
		
	System.out.println(al);

	}
}
