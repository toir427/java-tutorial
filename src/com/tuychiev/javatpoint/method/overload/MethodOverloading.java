package com.tuychiev.javatpoint.method.overload;

/**
 * @author Tuychiev Toir
 * @link http://tuychiev.com
 * @since 10/21/21
 */
class Addition {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Subtraction {
    static int subtract(int a, int b) {
        return a / b;
    }

    static double subtract(double a, double b) {
        return a / b;
    }
}

class TypePromotionIfMatchingFound {
    void sum(int a, long b) {
        long c = a + b; // c variable will be promoted to long
        System.out.println(c);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class TypePromotionInCaseOfAmbiguity {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading: changing no. of arguments");
        changingNoOfArguments();
        System.out.println("Method Overloading: changing data type od arguments");
        changingDataTypeOfArguments();
        System.out.println("Method Overloading with Type Promotion if matching found");
        typePromotionIfMatchingFound();
        System.out.println("Method Overloading with Type Promotion in case of ambiguity");
        typePromotionInCaseOfAmbiguity();
    }

    private static void typePromotionInCaseOfAmbiguity() {
        TypePromotionInCaseOfAmbiguity obj = new TypePromotionInCaseOfAmbiguity();
        obj.sum(20L, 20); // now ambiguity
    }

    private static void typePromotionIfMatchingFound() {
        TypePromotionIfMatchingFound obj = new TypePromotionIfMatchingFound();
        obj.sum(20, 20);
        obj.sum(20, 20, 20);
    }

    private static void changingDataTypeOfArguments() {
        System.out.println("Subtraction by int");
        System.out.println(Subtraction.subtract(12, 2)); // 6
        System.out.println("Subtraction by double");
        System.out.println(Subtraction.subtract(12.3, 2.1)); // 5.857142857142858
    }

    private static void changingNoOfArguments() {
        System.out.println("Addition by int");
        System.out.println(Addition.add(2, 4)); // 6
        System.out.println("Addition by int");
        System.out.println(Addition.add(2, 4, 5)); // 11
    }
}
