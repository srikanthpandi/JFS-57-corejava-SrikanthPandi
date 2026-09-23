package com.dsaproblems.example;

public class ArryaRight2{
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int n = arr.length;
		int d = 2;
		while(d > 0) {
			int last = arr[n - 1];
			for(int i = n - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
			d--;
		}
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
