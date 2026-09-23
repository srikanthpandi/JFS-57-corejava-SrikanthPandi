package com.demo.exp;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int fnum = sc.nextInt();
		System.out.println("Enter Second Number :");
		int snum = sc.nextInt();
		try {
			int result = fnum / snum;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("dont enter denominator as zero");
		}
		finally {
			System.out.println("to close connections");
		}
		System.out.println("remaining 1000 lines of code");

	}
}
