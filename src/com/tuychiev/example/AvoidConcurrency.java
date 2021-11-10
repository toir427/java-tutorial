package com.tuychiev.example;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 11/3/21
 */
public class AvoidConcurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        AvoidConcurrency thread = new AvoidConcurrency();
        thread.start();
        // Wait for thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Avoided Concurrency: " + amount);
        amount++;
        System.out.println("Avoided Concurrency: " + amount);
    }

    @Override
    public void run() {
        amount++;
    }
}
