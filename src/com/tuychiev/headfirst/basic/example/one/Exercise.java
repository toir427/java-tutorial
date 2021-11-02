package com.tuychiev.headfirst.basic.example.one;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/26/21
 */
class ExampleOne {
    static void execute() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.printf("small %s.\n", x);
            }
        }
    }
}

class ExampleTwo {
    static void execute() {
        int x = 1;
        while (x < 10) {
            x = x + 1;
            if (x > 3) {
                System.out.printf("big %s.\n", x);
            }
        }
    }
}

class ExerciseThree {
    static void execute() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.printf("small %s.\n", x);
            }
        }
    }
}

public class Exercise {
    public static void main(String[] args) {
        ExampleOne.execute();
        System.out.println("==================");
        ExampleTwo.execute();
        System.out.println("==================");
        ExerciseThree.execute();
    }
}
