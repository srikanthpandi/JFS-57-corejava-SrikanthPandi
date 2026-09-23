package com.demo.practisesession;

public class ThreadName {
	public static void main(String[] args) throws InterruptedException {
		        Thread t=new Thread();
		        t.setName("Downloading Thread....");
		        Thread t1=new Thread();
		        t1.setName("Upload Thread....");
		        Thread t2=new Thread();
		        t2.setName("Payment Thread...."); 
		        
		        System.out.println(t.getName());
		        Thread.sleep(1000);
		        System.out.println(t1.getName());
		        Thread.sleep(1000);
		        System.out.println(t2.getName());
		        
		    }
		}
	

