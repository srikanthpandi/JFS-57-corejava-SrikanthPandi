package com.demo.practisesession;

public class Withdraw {
    private double amount = 10000;

    public synchronized void withdraw(double withdrawAmount) {
        if (amount >= withdrawAmount) {
            System.out.println("Withdrawn amount is: " + withdrawAmount);
            amount -= withdrawAmount;
            System.out.println("Remaining amount is: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        Withdraw w = new Withdraw();

        Thread t1 = new Thread(() -> w.withdraw(6000));
        Thread t2 = new Thread(() -> w.withdraw(6000));

        t1.start();
        t2.start();
    }
}
