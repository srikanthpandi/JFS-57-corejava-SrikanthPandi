package com.demo.blocks;

import java.util.*;


public class TaskTask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int N=sc.nextInt();
		int[] arr=new int[N];
		int sum=0;int sum1=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}System.out.println(sum);
		int M=N;
		for(int j=0;j<=M;j++) {
			sum1+=j;
		}System.out.println(sum1);
		int sum3=sum-sum1;
		System.out.println("missing number is"+sum3);
	}

}
