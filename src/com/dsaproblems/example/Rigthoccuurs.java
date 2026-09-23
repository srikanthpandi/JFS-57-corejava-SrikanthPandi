package com.dsaproblems.example;

class RightOccurance{
	public static void main(String[] rgs){
		int arr[]={1,2,3,4,5,6,7,5,9,10};
		int n=arr.length;
		int x=5;
		int ans=-1;
		int l=0,r=n-1;
		while(l<=r){
			int mid=(l+r)/2;
			if(arr[mid]==x){
				ans=mid;
				l=mid+1;
			}
			else if(arr[mid]<x)
				l=mid+1;
			else
				r=mid-1;
		}
		System.out.println("Rightmost occurrence of "+x+" is at index "+ans);
	}
}