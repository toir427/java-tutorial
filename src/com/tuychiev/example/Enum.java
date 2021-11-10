package com.tuychiev.example;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enum {
    public static void main(String[] args) {
        Level myLevel = Level.HIGH;
        System.out.println(myLevel);
    }
}
