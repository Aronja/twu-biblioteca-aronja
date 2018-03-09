package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();
    }

    public void run() {
        WelcomeMessage message = new WelcomeMessage();
        message.printMessage();
        message.printAnswer();
        managingUsers Manager = setupUser();
        String libraryNumber = getLibraryNumber();
        String password = getPassword();

        if(!Manager.logIn(libraryNumber, password)){
            libraryNumber = getLibraryNumber();
            password = getPassword();
            Manager.logIn(libraryNumber, password);
        } else {
            System.out.println("Thanks, you are logged in!");
        }

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

    private managingUsers setupUser() {
        User Astrid = new User(
                "89375881",
                "biblioteca",
                "Astrid",
                "astrid@astrid.com",
                "3454459453");
        managingUsers Manager = new managingUsers();
        Manager.addUsers(Astrid);
        Astrid.getDetails();
        return Manager;
    }

    private String getLibraryNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your library number: ");
        return scanner.next();
    }

    private String getPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        return scanner.next();
    }
}

