package com.tuychiev.javatpoint.method.overload;

/**
 * @author Tuychiev Toir
 * @link http://tuychiev.com
 * @since 10/21/21
 */
public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("main method with String[]");
    }

    public static void main(String args) {
        System.out.println("main method with String");
    }

    public static void main() {
        System.out.println("main method without args");
    }
}
