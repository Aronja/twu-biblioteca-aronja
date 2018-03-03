package com.twu.biblioteca;

import java.util.Scanner;

public class MainMenu {

    public void printMenu() {
        System.out.println("Would you like to search for Books? Then type B");

        String bookmenu;
        Scanner in = new Scanner(System.in);

        bookmenu = in.nextLine();

        if (bookmenu.equals("B")){
            System.out.println("Booklist");
        } else {
            System.out.println("Please type B to view our Booklist!");
        }
    }
}
