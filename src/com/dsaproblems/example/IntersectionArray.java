package com.dsaproblems.example;

public class IntersectionArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,8};
		int[] b= {2,4,6,7,8};
		for( int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
