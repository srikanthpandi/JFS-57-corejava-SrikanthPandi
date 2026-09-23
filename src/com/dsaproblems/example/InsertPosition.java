package com.dsaproblems.example;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int pos = nums.length; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                pos = i;
                break;
            }
        }

        System.out.println("Target element should be inserted at position: " + pos);
       
    }
}
