package com.demo.practisesession;

public class TwoThreads extends Thread{
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
		   @Override
           public void run() {
               for (int i = 1; i <=10; i++) {
                   System.out.println("Thread 1: " + i);
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int j=65;j<=75;j++) {
					System.out.println("Thread 2: "+(char)j);
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		
		});
		t1.start();
		t2.start();
		
	}}


