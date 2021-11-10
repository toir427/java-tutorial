package com.tuychiev.example;

import java.util.ArrayList;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 11/3/21
 */
public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.forEach(v -> {
            System.out.println("value" + v);
        });
    }
}
