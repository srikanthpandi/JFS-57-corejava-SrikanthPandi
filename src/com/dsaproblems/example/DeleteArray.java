package com.dsaproblems.example;

public class DeleteArray {
	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14,15};
		int position=3;
		int newArr[]=new int[arr.length-1];
		for(int i=0;i<position;i++) {
			newArr[i]=arr[i];
		}
		for(int i=position;i<newArr.length;i++) {
		newArr[i]=arr[i+1];
		}
		for(int x:newArr) {
			System.out.println(x);
		}
	}
}
