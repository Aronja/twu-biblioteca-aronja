
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {

    private ArrayList<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<LibraryItem>();
    }

    public void addItems(LibraryItem... libraryItemsToAdd) {
        for (LibraryItem item : libraryItemsToAdd) {
            items.add(item);
        }
    }

    public void listOfBooks() {
        System.out.println("Find the available books here");
        System.out.println("Author   |   Title  |   Year");
        for (LibraryItem item : books()) {
            System.out.println(item.getDetails());
        }
    }

    private ArrayList<LibraryItem> books(){
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        for(LibraryItem item : items){
            if(item instanceof Book){
                books.add(item);
            }
        }
        return books;
    }

    public void checkoutBook() {
            String checkout;
            Scanner in = new Scanner(System.in);

            checkout = in.nextLine();

            if (checkout.equals("C")){
                System.out.println("You have checked out a book");
            } else {
                System.out.println("This book is not available!");
            }
        }
}
