package com.tuychiev.headfirst.primitive.assignment;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/28/21
 */
public class Conversion {
    public static void main(String[] args) {
        byte b = 3;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("byte -> short -> int -> long -> float -> double");
        System.out.printf("byte: %s -> short: %s -> int: %s -> long: %s -> float: %s -> double: %s", b, s, i, l, f, d);
    }
}
