package com.dsaproblems.example;


public class DuplicateElemet {
	public static void main(String[] args) {
		int[] a= {1,2,3,3,4,5};
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate "+a[i]);
					found=true;
					break;
				}
			}
			if(found) {
				break;
			}
		}
		if(!found) {
			System.out.println("not found");
		}
	
	}

}
