package com.dsaproblems.example;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] mergedArray=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        for(i=0;i<arr1.length;i++){
            mergedArray[k++]=arr1[i];
        }
        for(j=0;j<arr2.length;j++){
            mergedArray[k++]=arr2[j];
        }
        
        for(int l=0;l<mergedArray.length;l++){
            System.out.print(mergedArray[l]+" ");
        }
    }
		
	}


