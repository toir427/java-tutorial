package com.tuychiev.example;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
class ThreadExtend extends Thread {
    @Override
    public void run() {
        System.out.println("This code is running in a thread.");
    }
}

class RunnableImplement implements Runnable {
    @Override
    public void run() {
        System.out.println("This code is running in a thread.");
    }
}

public class Threads {

    public static void main(String[] args) {
        runningThreadByExtending();
        runningThreadByImplementing();
    }

    private static void runningThreadByImplementing() {
        System.out.println("Running a thread by implementing the Runnable interface");
        RunnableImplement runnableImplement = new RunnableImplement();
        Thread thread = new Thread(runnableImplement);
        thread.start();
        System.out.println("This code is outside of the thread.");
    }

    private static void runningThreadByExtending() {
        System.out.println("Running a thread by extending the thread class");
        ThreadExtend thread = new ThreadExtend();
        thread.start();
        System.out.println("This code is outside of the thread.");
    }
}
