package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class LibraryTest {

    private Library setUpLibrary() {
        Library library = new Library();
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("Who owns the future", "Jaron Lanier", 2013);
        library.addItems(b1, b2);
        library.listOfBooks();
        return library;
    }

    User user;
    managingUsers Manager;


    @Before public void serveupMocks() {
        user = mock(User.class);
        when(user.getDetails()).thenReturn("test");
        Manager = mock(managingUsers.class);
        when(Manager.getCurrentUser()).thenReturn(user);
    }

    Library library = setUpLibrary();
    public ArrayList<LibraryItem> items;

    @Test public void TestBookCheckOutFunction() {
        String answer;
        {
            answer = "The Hobbit";
        }
        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);

        library.checkoutBook(Manager);
        System.out.println((library.getItems().size()));
        assertEquals((library.getItems().size()), 1);

    }


    @Test public void TestBookReturnFunction() {
        String answer;
        {
            answer = "The Hobbit";
        }
        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);
        library.returnBook(Manager);
        System.out.println((library.getItems().size()));
        assertEquals((library.getItems().size()), 2);

    }

}