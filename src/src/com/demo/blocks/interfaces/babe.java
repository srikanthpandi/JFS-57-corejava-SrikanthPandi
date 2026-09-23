package com.demo.blocks.interfaces;


interface mom{
	default void sleep() {
		System.out.println("sleep left direction");
	}
}
interface dad{
	default void sleep() {
		System.out.println("sleep right direction");
	}
}
public class babe implements dad,mom{
	public void sleep() {
		System.out.println("i can sleep my way");
		mom.super.sleep();
		dad.super.sleep();
		
	}
	public static void main(String[] args) {
		babe bb=new babe();
		bb.sleep();
		
	}
	
}
