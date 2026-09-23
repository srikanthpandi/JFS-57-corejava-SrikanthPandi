package com.dsaproblems.example;

public class PairSumTwoPointer{
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,8,9,10,11};
        int left=0;
        int right=arr.length-1;
        int target=10;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Pair found: ("+arr[left]+", "+arr[right]+")");
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        
    }
}