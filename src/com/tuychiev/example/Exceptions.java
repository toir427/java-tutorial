package com.tuychiev.example;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class Exceptions {
    public static void main(String[] args) {
        tryCatch();
        checkAge(15);
    }

    private static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    private static void tryCatch() {
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (java.lang.Exception e){
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
