package com.tuychiev.javatpoint;

import java.io.IOException;

/**
 * @author Tuychiev Toir
 * @link http://tuychiev.com
 * @since 10/21/21
 */
public class Loop {

    /**
    * @since 2016
    * @param args Unused
    * @see IOException
    * */
    public static void main(String[] args) {

        // for (initialization, condition; increment/decrement) {}
        for (int i = 0; i < 10; i++) {
            System.out.println("Item " + i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.println("==");
            } else {
                System.out.print("==");
            }
        }

        int[] arr = {1, 2, 3, 4, 5};
        // for (data type iterator: iterable) {}
        for (int i : arr) {
            System.out.println("Item " + i);
        }

        // for (;;) {} infinitive

        // while (condition) { increment/decrement statement }

        int i = 0;
        while (i <= 10) {
            System.out.println("Item " + i);
            i++;
        }

        // while (true) {} infinitive

        // do {
        //   code to be executed / loop body
        //   update statement
        // } while (condition);

        int d = 0;
        do {
            System.out.print("Item " + d);
            d++;
        } while (d <= 10);

        // infinitive do-while loop
        //do {
            // code to be executed
        //} while (true);


    }
}
