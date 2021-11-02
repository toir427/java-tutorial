package com.tuychiev.headfirst.encapsulation;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 11/1/21
 */
class XCopy {
    int go(int arg) {
        return arg * 2;
    }
}

public class XCopyTestDrive {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
}
