package com.demo.practisesession;

public class DemoThreadwait {
  public static void main(String[] args) {
	Thread t1=new Thread(new Runnable() {

		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
					System.out.println("Waiting for one sec");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	});
	t1.start();
}
}
