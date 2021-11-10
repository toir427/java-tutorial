package com.tuychiev.example;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 11/3/21
 */
public class Concurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Concurrency thread = new Concurrency();
        thread.start();
        System.out.println("Concurrency: " + amount);
        amount++;
        System.out.println("Concurrency: " + amount);
    }

    @Override
    public void run() {
        amount++;
    }
}
