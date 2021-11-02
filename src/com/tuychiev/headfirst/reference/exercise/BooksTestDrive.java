package com.tuychiev.headfirst.reference.exercise;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/29/21
 */
class Books {
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] books = new Books[3];
        int x = 0;
        books[0].title = "The Grapes of Java";
        books[1].title = "The Java Gatsby";
        books[2].title = "The Java Cookbook";
        books[0].title = "bob";
        books[1].title = "sue";
        books[2].title = "ian";

        while (x < books.length) {
            System.out.printf("%s by %s.\n", books[x].title, books[x].author);
            x = x + 1;
        }
    }
}
