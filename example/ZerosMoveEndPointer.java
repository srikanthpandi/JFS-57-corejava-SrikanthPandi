package com.dsaproblems.example;

public class ZerosMoveEndPointer {
	public static void main(String[] args) {
		 int[] arr={0,1,2,0,3,4};
	        int slow=0;
	        int fast=0;
	        while(fast<arr.length){
	            if(arr[fast]!=0){
	                int temp=arr[slow];
	                arr[slow]=arr[fast];
	                arr[fast]=temp;
	                slow++;
	            }
	            fast++;
	        }
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+" ");
	}

	}
}
