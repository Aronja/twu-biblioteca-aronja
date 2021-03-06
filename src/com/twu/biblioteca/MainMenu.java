package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public String printMenu(Library library) {
        System.out.println("Main Menu");
        System.out.println("Would you like to search for Books and Movies? Then type B or M");

        String bookmenu;
        Scanner in = new Scanner(System.in);

        bookmenu = in.nextLine();

        if (bookmenu.equalsIgnoreCase("B")){
            System.out.println("Booklist");
            library.listOfBooks();
        } else if (bookmenu.equalsIgnoreCase("M")) {
            System.out.println("Movies");
            library.listMovies();
        } else {
            System.out.println("Select a valid option! (Please type B to view our Booklist or M to view our Movies!)");
        }
        return bookmenu;
    }
}
