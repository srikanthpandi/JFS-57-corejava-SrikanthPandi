package com.dsaproblems.example;

public class UnsortedEleSearchBinary{
    public static void main(String[] args){
        int[] arr={2,3,4,1,5,7,6,9};
        int target=5;
        int low=0;
        int high=arr.length-1;
        //srort the array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]);
        }
        //search the target element
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Element not found");

    }
}