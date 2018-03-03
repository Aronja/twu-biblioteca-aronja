
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {

    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryItem> checkedOutItems = new ArrayList<LibraryItem>();


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
            String Title = "The Hobbit";

            if (checkout.equals(Title)){
                System.out.println("You have checked out a book");
                removeFromLibrary(Title);
            } else {
                System.out.println("This book is not available!");
            }
        }

    private void removeFromLibrary(String Title) {
        for (LibraryItem item : new ArrayList<LibraryItem>(items)){
            if(item.getTitle().equals(Title)){
                items.remove(item);
                listOfBooks();
                checkedOutItems.add(item);
            }
        }
    }
}
