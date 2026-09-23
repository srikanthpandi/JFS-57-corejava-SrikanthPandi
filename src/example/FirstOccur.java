package com.dsaproblems.example;

public class FirstOccur {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,3,3,3,3,5};
		int target=3;
		int count=0;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println("Target at ::"+index);
	}
}
