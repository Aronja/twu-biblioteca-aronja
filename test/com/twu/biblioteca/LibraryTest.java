package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library setUpLibrary() {
        Library library = new Library();
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("Who owns the future", "Jaron Lanier", 2013);
        library.addItems(b1, b2);
        library.listOfBooks();
        return library;
    }

    Library library = setUpLibrary();
    public ArrayList<LibraryItem> items;



    @Test public void TestBookCheckOutFunction() {
        System.out.println(items.size());
        library.checkoutBook();
        System.out.println(items.size());
        assertEquals(items.size(), 3);

    }

    @Test public void TestBookReturnFunction() {
        System.out.println(items.size());
        library.returnBook();
        System.out.println(items.size());
        assertEquals(items.size(), 4);

    }

}