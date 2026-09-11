package com.dsaproblems.example;

public class StringEle {
	public static void main(String[] args) {
		String[] arr= {"Ak","Dk","JK"};
		String target="Dk";
		boolean found =false;
		for(String n:arr) {
			if(n.equals(target)) {
				found=true;
				break;
			}
		}
	System.out.println(found ?"Found":"not found");
	
	////even  frist number
	int[] arrs= {3,4,6,5,7};
	for(int n:arrs) {
		if(n%2==0) {
		System.out.println(n);
		return;
	}
	}
	}

}
