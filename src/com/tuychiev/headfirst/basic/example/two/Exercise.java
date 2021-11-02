package com.tuychiev.headfirst.basic.example.two;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/26/21
 */
class One {
    static void execute() {
        int x = 1;
        while (x < 10) {
            x = x + 1; // commit it for forever loop or infinite
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

class Two {
    static void execute() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("two: small x");
            }
        }
    }
}

class Three {
    static void execute() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("three: small x");
            }
        }
    }
}

class Four {
    static void execute() {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}

public class Exercise {
    public static void main(String[] args) {
        One.execute();
        Two.execute();
        Three.execute();
        Four.execute();
    }
}
