package com.tuychiev.headfirst.objectville;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/27/21
 */
class Dog {
    int size;
    int bread; // instance variables
    String name;

    void bark() { // a method
        System.out.println("Ruff! Ruff!");
    }
}

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog(); // make a Doc object
        d.size = 40; // use the dot operator (.) to set the size of the Dog
        d.bark(); // and to call it bark() method
    }
}
