package com.demo.blocks.interfaces;


interface A{
	void m1();
public default void sleeping() {
	System.out.println("Sleeping in classs");
}

}
public class Demo implements A{
	@Override
	public void m1() {
		System.out.println("Someone is eating");
	}

	public void sleeping() {
		System.out.println("sleeping with dreamzz....");
}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.sleeping();
	}

}
