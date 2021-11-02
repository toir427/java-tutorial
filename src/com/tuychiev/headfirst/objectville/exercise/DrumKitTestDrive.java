package com.tuychiev.headfirst.objectville.exercise;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/27/21
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare) {
            d.playSnare();
        }
    }
}
