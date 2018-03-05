package com.twu.biblioteca;

import com.twu.biblioteca.WelcomeMessage;
import com.twu.biblioteca.BibliotecaApp;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import junit.framework.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExampleTest extends TestCase {
    protected int value1, value2;

    // assigning the values
    protected void setUp() {
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    public void testAdd() {
        double result = value1 + value2;
        assertTrue(result == 6);
    }
}




