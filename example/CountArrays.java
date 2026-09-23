package com.dsaproblems.example;

public class CountArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,1,1};
		 
//		 for(int i=0;i<a.length;i++){
//			 int count=0;
//	            for(int j=0;j<a.length;j++){
//	                if(a[i]==a[j]){
//	                    count++;
//	                }
//	            }
//	            System.out.println(a[i]+" "+count);
//		}
	//	method 2
//		 
		boolean visited[]=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(count);
		}
	}

}
