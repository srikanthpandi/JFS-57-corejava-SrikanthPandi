package com.demo.practisesession;


public class RunnableThreadHelloWorld implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Wolrd");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	}

public static void main(String[] args) {
	RunnableThreadHelloWorld Rt=new RunnableThreadHelloWorld();
	Rt.run();
}
}
