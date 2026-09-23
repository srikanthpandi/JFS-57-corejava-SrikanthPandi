package com.demo.practisesession;

public class Number1to10Thread extends Thread{

		@Override
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.print(" "+i);
			}
		}
		public static void main(String[] args) {
			Number1to10Thread num=new Number1to10Thread();
			num.start();
			
		}
	}
