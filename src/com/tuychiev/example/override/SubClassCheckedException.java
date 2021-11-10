package com.tuychiev.example.override;

import java.io.IOException;

/**
 * @author Tuychiev Toir
 * @link http://tuychiev.com
 * @since 10/21/21
 */
class Parent {
    void message() throws IOException {
        System.out.println("parent method");
    }
}

class Child extends Parent {
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

public class SubClassCheckedException {
    public static void main(String[] args) throws IOException {
        Parent parent = new Child();
        parent.message();
    }
}
