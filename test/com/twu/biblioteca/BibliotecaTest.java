package com.twu.biblioteca;

import org.junit.Test;


public class BibliotecaTest {
    BibliotecaApp biblioteca = new BibliotecaApp();
    WelcomeMessage message = new WelcomeMessage();
    Library library = setUpLibrary();
    library.checkoutBook();
    library.returnBook();

    private Library setUpLibrary() {
        Library library = new Library();
        Book Book1 = new Book("Food and Stuff", "Alice", 2015);
        Book yetAnotherBook = new Book("Amazing Literature", "myself", 2018);
        Book newBook = new Book("Slow motion", "Sloth", 2010);
        library.addItems(Book1, yetAnotherBook, newBook);
        library.listOfBooks();
        return library;
    }

    @Test
    public void CheckOutBookFoodandStuff() {
        // set answer in printAnswer() in WelcomeMessage.java to "Y"
        // set bookmenu in MainMenu.java to "B"
        // run library.checkoutBook(); and set the Input to "Food and Stuff"

        // assert length of items Array ( should be 2)
    }

    @Test
    public void ReturnBookFoodandStuff() {
        // set answer in printAnswer() in WelcomeMessage.java to "Y"
        // set bookmenu in MainMenu.java to "B"
        // run library.returnBook();(); and set the Input to "Food and Stuff"

        // assert length of items Array ( should be 3 again)
    }



}

