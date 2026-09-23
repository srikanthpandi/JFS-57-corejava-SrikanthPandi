package com.dsaproblems.example;


import java.util.Arrays;
import java.util.List;

public class Elemefound {
	public static void main(String[] args) {
		
		List<String> Li=Arrays.asList ("books","paper","pencil");
		String target="book";
		for(int i=0;i<Li.size();i++) {
			if(Li.get(i).equals(target)){
			System.out.println("found");
			return;
		}
		}
		System.out.println("No element found");
	}

}
