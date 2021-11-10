package com.tuychiev.example.override;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/21/21
 */
class _Parent {
    void message() throws ArithmeticException {
        System.out.println("parent method");
    }
}

class _Child extends _Parent {
    @Override
    void message() {
        System.out.println("child method");
    }
}

public class SubClassDeclaresParentException {
    /**
     * If the superclass method declares an exception,
     * subclass overridden method can declare the same subclass exception or
     * no exception but cannot declare parent exception.
     */
    public static void main(String[] args) {
        _Parent child = new _Child();
        try {
            child.message();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
