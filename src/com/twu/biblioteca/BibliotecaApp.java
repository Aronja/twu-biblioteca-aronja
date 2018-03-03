package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();
    }

    public void run() {
        WelcomeMessage message = new WelcomeMessage();
        message.printMessage();
        message.printAnswer();
        com.twu.biblioteca.Library library = setUpLibrary();
    }

    private Library setUpLibrary() {
        Library library = new Library();
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("Who owns the future", "Jaron Lanier", 2013);
        library.addItems(b1, b2);
        library.listOfBooks();
        return library;
    }
}

