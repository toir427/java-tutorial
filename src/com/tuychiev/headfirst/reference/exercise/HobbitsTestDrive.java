package com.tuychiev.headfirst.reference.exercise;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/29/21
 */
class Hobbits {
    String name;
}

public class HobbitsTestDrive {
    public static void main(String[] args) {
        Hobbits[] hobbits = new Hobbits[3];
        int z = 0;
        while (z < 3) {
            hobbits[z] = new Hobbits();
            hobbits[z].name = "Bilbo";
            if (z == 1) {
                hobbits[z].name = "Frodo";
            }
            if (z == 2) {
                hobbits[z].name = "Sam";
            }
            System.out.printf("%s is a good Hobbit name.\n", hobbits[z].name);
            z = z + 1;
        }
    }
}
