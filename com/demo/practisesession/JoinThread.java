package com.demo.practisesession;

public class JoinThread {
  public static void main(String[] args) throws InterruptedException {
	Thread t1=new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Downloading......");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	});
	Thread t2=new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Printing......");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	});
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	
}
}
