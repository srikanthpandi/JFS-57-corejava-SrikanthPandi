package com.demo.java8;

// Without lambda
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Seeta Thread");
        }
    }

    public static void main(String[] args) {
        // Using traditional Runnable implementation
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Rama Thread");
        }

        // Using lambda expression
        Runnable r = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Seeta Thread (Lambda)");
            }
        };

        Thread t2 = new Thread(r);
        t2.start();
    }
}
