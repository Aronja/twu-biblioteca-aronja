
package com.twu.biblioteca;

import java.util.ArrayList;


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
}