package com.dsaproblems.example;

public class LRindex{
	public static void main(String[] args){
		int[] arr={1,2,2,3,4,5,6,6,7,8,9};
		int n=arr.length;
		int left=0;
		int right=n-1;
		int leftIndex=-1;
		int rightIndex=-1;
		int target=6;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==target){
				leftIndex=mid;
				rightIndex=mid;
				while(leftIndex>0 && arr[leftIndex-1]==target){
					leftIndex--;
				}
				while(rightIndex<n-1 && arr[rightIndex+1]==target){
					rightIndex++;
				}
				break;
			}
			else if(arr[mid]<target){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		System.out.println(leftIndex);
		System.out.println(rightIndex);
	}
}