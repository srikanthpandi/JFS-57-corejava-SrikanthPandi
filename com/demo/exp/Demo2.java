package com.demo.exp;

public class Demo2 {
	public static void main(String[] args) {

		try {
			int arr[] = new int[4];
			arr[3] = 89;//arrayiis
			int a = 78;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("dont eneter denomitor as zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array is out of bound");
		} catch (NullPointerException e) {
			System.out.println("null pointer handong");
		} catch (Exception e) {
			System.out.println("parent is handled...");
		} finally {
			System.out.println("to close the connections");
		}
		System.out.println("remaining 1000 lines of ocdee");

	}
}
