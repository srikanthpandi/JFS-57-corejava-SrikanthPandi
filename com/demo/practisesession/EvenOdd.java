package com.demo.practisesession;

public class EvenOdd extends Thread{
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
		   @Override
           public void run() {
               for (int i = 1; i <=10; i++) {
            	   if(i%2==0) {
                   System.out.println("\nThread 1: " + i);
                   i++;
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
            	   }
               }
           }
       });
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					if(i%2!=0) {
					System.out.println("Thread 2: "+i);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
			}
		
		});
		t1.start();
		
		t2.start();
		
	}}


