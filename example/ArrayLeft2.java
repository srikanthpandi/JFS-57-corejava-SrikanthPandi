package com.dsaproblems.example;

public class ArrayLeft2{
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int n = arr.length;
		int d = 2; 
		while (d > 0) {
			int first = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = first;
			d--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
