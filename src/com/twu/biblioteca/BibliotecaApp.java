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
        MainMenu mainmenu = new MainMenu();
        mainmenu.printMenu();
        Library library = setUpLibrary();
        System.out.println("Type the Title to checkout a book or movie");
        library.checkoutBook();
        System.out.println("Type the Title to return a book or movie");
        library.returnBook();



    }

    private Library setUpLibrary() {
        Library library = new Library();
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("Who owns the future", "Jaron Lanier", 2013);
        Movie m1 = new Movie("Lord of the Rings", "Peter Jackson", "10", 2001);
        Movie m2 = new Movie ("Fight Club", "David Fincher", "8", 1999);
        library.addItems(b1, b2, m1, m2);
        library.listOfBooks();
        library.listMovies();
        return library;
    }
}

