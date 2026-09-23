package com.dsaproblems.example;

public class ArrayInsert {

	public static void main(String[] args) {
		int[] arr= {12,14,15,17};
		int position=2;
		int value=16;
		int[] arr1=new int[arr.length+1];
		for(int i=0;i<position;i++) {
			
			arr1[i]=arr[i];
		}
		arr1[position]=value;
		for( int i=position;i<arr.length;i++) {
			arr1[i+1]=arr[i];
		}
		System.out.println(arr1[position]);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	
	}

}
