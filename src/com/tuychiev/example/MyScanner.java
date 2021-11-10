package com.tuychiev.example;

import java.util.Scanner;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name, age, salary: ");

        // String input
        String name = scanner.nextLine();

        // Numerical input
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        // Output input by user
        System.out.printf("Name: %s,\nAge: %s,\nSalary: %s\n", name, age, salary);
    }
}
