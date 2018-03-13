
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {

    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryItem> checkedOutItems = new ArrayList<LibraryItem>();

    public ArrayList<LibraryItem> getItems() {
        return this.items;
    }


    public Library() {
        this.items = new ArrayList<LibraryItem>();
    }

    public void addItems(LibraryItem... libraryItemsToAdd) {
        for (LibraryItem item : libraryItemsToAdd) {
            items.add(item);
        }
    }

    public void listOfBooks() {
        System.out.println("Find the available books and movies here");
        System.out.println("Author   |   Title  |   Year");
        for (LibraryItem item : books()) {
            System.out.println(item.getDetails());
        }
    }

    public void listMovies(){
        System.out.println("Here are the available movies");
        System.out.println("Title   |   Director   |   Rating   |   Year");
        for (LibraryItem item : movies()){
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

    private ArrayList<LibraryItem> movies(){
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();
        for(LibraryItem item : items){
            if(item instanceof Movie){
                movies.add(item);
            }
        }
        return movies;
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

        //This does not work yet!!
        if (!Title.equals("")){
            System.out.println("You have checked out a book");
            User.getDetails();
        }
        else {
            System.out.println("This book is not available!");
        }
    }

    private void removeFromLibrary(LibraryItem item) {
        items.remove(item);
        listOfBooks();
        listMovies();
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

        //This does not work yet!
        if (!Title.equals("")){
            System.out.println("You have returned a book");
            User.getDetails();
        }
        else {
            System.out.println("This book was not part of this library!");
        }
    }

    private void returnToLibrary(LibraryItem item) {
        checkedOutItems.remove(item);
        listOfBooks();
        listMovies();
        items.add(item);
    }

}
