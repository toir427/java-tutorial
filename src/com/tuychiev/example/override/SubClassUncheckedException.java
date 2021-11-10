package com.tuychiev.example.override;

import java.io.IOException;

/**
 * @author Tuychiev Toir
 * @link http://tuychiev.com
 * @since 10/21/21
 */
class SuperClass {
    void message() throws IOException {
        System.out.println("parent method");
    }
}

class SubClass extends SuperClass {
    /**
     * If the superclass method does not declare an exception,
     * subclass overridden method cannot declare the checked exception.
     * <p>
     * you could remove `throws IOException` on Parent class if you want to check
     */
    @Override
    void message() throws IOException {
        System.out.println("Child method");
    }
}

public class SubClassUncheckedException {
    public static void main(String[] args) throws IOException {
        SuperClass child = new SubClass();
        child.message();
    }
}
