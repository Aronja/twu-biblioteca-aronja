
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
        String Title="";
        Scanner in = new Scanner(System.in);

        checkout = in.nextLine();
        for (LibraryItem item : new ArrayList<LibraryItem>(items)){
            if (item.getTitle().equals(checkout)){
                removeFromLibrary(item);
                Title = item.getTitle();
                break;
            }
        }

        if (!Title.equals("")){
            System.out.println("You have checked out a book");
        }
        else {
            System.out.println("This book is not available!");
        }
    }

    private void removeFromLibrary(LibraryItem item) {
        items.remove(item);
        listOfBooks();
        checkedOutItems.add(item);
    }


    public void returnBook() {
        String returnBook;
        String Title ="";
        Scanner in = new Scanner(System.in);

        returnBook = in.nextLine();
        for (LibraryItem checkedOutItems : new ArrayList<LibraryItem>(checkedOutItems)){
            if (checkedOutItems.getTitle().equals(returnBook)){
                returnToLibrary(checkedOutItems);
                Title = checkedOutItems.getTitle();
                break;
            }
        }

        if (!Title.equals("")){
            System.out.println("You have returned a book");
        }
        else {
            System.out.println("This book was not part of this library!");
        }
    }

    private void returnToLibrary(LibraryItem item) {
        checkedOutItems.remove(item);
        listOfBooks();
        items.add(item);
    }

}
