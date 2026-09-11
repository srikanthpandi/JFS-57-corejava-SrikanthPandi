package com.demo.poly;

interface Mom{
	
	public abstract void sleep();
	
}
interface Dad{
	
	public abstract void sleep();
}
public class Baby implements Mom,Dad{
	@Override
	public void sleep() {
		System.out.println("dont distrub i can sleep my own...");
	}
	public static void main(String[] args) {		
		Baby bb= new Baby();
		bb.sleep();
	}
}
