package com.dsaproblems.example;

public class TwoPointerPalindrome {
	public static void main(String[] args) {
		String n="level";
		int left=0;
		int right=String.valueOf(n).length()-1;
		while(left < right){
            if(String.valueOf(n).charAt(left) != String.valueOf(n).charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }else {
            	System.out.println("palidrome");
            }
            left++;
            right--;
        }
	}

}
