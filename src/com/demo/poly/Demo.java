package com.demo.poly;

abstract class Muchatlu {
	public abstract void sleep();// unimpl or abstract
	public Muchatlu() {
		System.out.println("memu anter everiki vinam...muchatlu always");
	}

	public void m1() {
		System.out.println("dsjcvdscvdsv");
	}
}
public class Demo extends Muchatlu {
	@Override
	public void sleep() {
		System.out.println("every one is enjoying...");
	}
	public static void main(String[] args) {

		//Muchatlu m = new Muchatlu();
		Muchatlu m= new Demo();
		  
	}

}
