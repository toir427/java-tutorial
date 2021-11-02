package com.tuychiev.headfirst.objectville.exercise;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/27/21
 */
class TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.println("tape recording");
    }
}

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord) {
            t.recordTape();
        }
    }
}
