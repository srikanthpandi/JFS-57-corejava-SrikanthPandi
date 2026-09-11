package com.dsaproblems.example;

public class FindElesort {
	public static void main(String[] args) {
		int[] arr= {10,20,40,30,60};
		int target=40;
		 boolean found=false;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==target) {
				 found=true;
			 }
			 if(arr[i]>target) {
				 break;
			 }
		 }
		 System.out.println(found?"found":"not found");
		
	}

}
