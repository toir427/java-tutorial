package com.tuychiev.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class Array {
    public static void main(String[] args) {
        arrayExamples();
        arrayListExamples();
    }

    private static void arrayListExamples() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.printf(">> Create an ArrayList: %s\n", cars);
        System.out.printf(">> Access an item in an ArrayList: %s\n", cars.get(0));
        cars.remove(0);
        System.out.printf(">> Remove an item from an ArrayList: %s\n", cars);
        System.out.printf(">> Get the size of an ArrayList: %s\n", cars.size());

        System.out.println(">> Loop through an ArrayList: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println(">> Loop through an ArrayList with for-each: ");
        for (String car : cars) {
            System.out.println(car);
        }

        cars.clear();
        System.out.printf(">> Remove all item from an ArrayList: %s\n", cars);

        System.out.println(">> Create an ArrayList that should store numbers (integers): ");
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(15);
        integers.add(30);
        integers.add(43);
        for (int integer : integers) {
            System.out.println(integer);
        }
    }

    private static void arrayExamples() {
        System.out.println(">> Create and access an array");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.printf("I want to buy %s\n", cars[2]);

        System.out.println(">> Change an array element or Access an array");
        cars[0] = "Opel";
        System.out.println(Arrays.toString(cars));

        System.out.println(">> Find the length of an array");
        System.out.printf("cars array length: %s", cars.length);

        // Loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println(">> Loop through an array with for-each");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(">> Multidimensional array");
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        System.out.println(">> Loop through a multidimensional array");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
