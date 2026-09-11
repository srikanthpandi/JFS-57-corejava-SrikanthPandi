package com.dsaproblems.example;

public class MaxMinArr {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int MAX=arr1[0];
		int MIN=arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>MAX) {
				MAX=arr1[i];
			}
		}
		System.out.println(MAX);

		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<MIN) {
				MIN=arr1[i];
			}
		}
		System.out.println(MIN);
	}

}
