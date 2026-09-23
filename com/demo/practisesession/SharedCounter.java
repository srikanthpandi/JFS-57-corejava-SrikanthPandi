package com.demo.practisesession;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {
    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> incrementCounter());
        Thread second = new Thread(() -> incrementCounter());

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Final Count: " + count.get());
    }

    static void incrementCounter() {
        for (int i = 0; i < 1000; i++) {
            count.incrementAndGet();
        }
    }
}
