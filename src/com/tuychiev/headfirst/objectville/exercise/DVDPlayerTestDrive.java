package com.tuychiev.headfirst.objectville.exercise;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/27/21
 */
class DVDPlayer {
    boolean canRecord = false;

    void playDVD() {
        System.out.println("DVD playing");
    }

    void recordDVD() {
        System.out.println("DVD recording");
    }
}

public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord) {
            d.recordDVD();
        }
    }
}
