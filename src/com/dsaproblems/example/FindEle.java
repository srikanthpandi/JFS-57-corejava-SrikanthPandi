package com.dsaproblems.example;

public class FindEle {
	public static void main(String[] args) {
		int[] arr= {23,18,19,0,2,1,3};
		int target=19;
		int index=-1;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==target) {
				 index=i;
				 break;
			 }
		 }
		 System.out.println(index!=-1?"Found at index"+index :"not found");
	}
}
