package com.demo.exp;

public class Demo3 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[4] = 90 /0;
			String s = "123";
			int x = Integer.parseInt(s);
			System.out.println(s.length());				
			System.out.println("no error :" + a[4] + " " + x);
		} 
		catch (
				 ArithmeticException 
				|ArrayIndexOutOfBoundsException 
				| NumberFormatException 
				|NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("to close conncection");
		}
		System.out.println("remaing 1000 lines of code");
	}
}
