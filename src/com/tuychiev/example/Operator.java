package com.tuychiev.example;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class Operator {
    public static void main(String[] args) {
        int addition = 2 + 2;
        System.out.println("Addition: " + addition); // 4
        int subtraction = 6 - 2;
        System.out.println("Subtraction: " + subtraction); // 4
        int multiplication = 2 * 3;
        System.out.println("Multiplication: " + multiplication); // 6
        int division = 6 / 2;
        System.out.println("Division: " + division); // 3
        int remainder = 12 % 3;
        System.out.println("Remainder/Modulus: " + remainder); // 4
        int increment = ++addition;
        System.out.println("Increment: " + increment); // 5
        int decrement = --subtraction;
        System.out.println("Decrement: " + decrement); // 3
        int assignment = 3;
        System.out.println("Assignment: " + assignment); // 3
        boolean comparison = (addition == subtraction);
        System.out.println("Comparison: " + String.valueOf(comparison)); // false
        boolean logical = addition > 3 && subtraction < 5;
        System.out.println("Logical: " + String.valueOf(logical)); // true

        int a = 0;
        System.out.println(a++); // post increment operator
        System.out.println(a);
        System.out.println(--a); // pre decrement operator

        int x = 0;
        int z = ++x; // increment x by 1. next line
        System.out.println(x + " " + z);
        x = 0;
        z = x++; // increment x by 1. this line
        System.out.println(x + " " + z);
    }
}
