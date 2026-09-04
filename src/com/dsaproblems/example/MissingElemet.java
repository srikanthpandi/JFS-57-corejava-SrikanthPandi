package com.dsaproblems.example;

public class MissingElemet {
	public static void main(String[] args) {
		
		int sum=0;
		int[] a= {1,2,4,5};
		int n=a.length;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		int total=0;
		for(int j=0;j<a.length;j++) {
			total+=a[j];
		}
		System.out.println(total);
		int finalsum=total-sum;
		System.out.println(finalsum);
	}
}
