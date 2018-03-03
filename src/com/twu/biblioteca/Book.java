package com.twu.biblioteca;

public class Book implements LibraryItem{

    private String Title;
    private String Author;
    private int Year;

    public Book(String Title, String Author, int Year){
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    public String getDetails(){
        String details = Title + " | " + Author + " | " + Year ;
        return details;
    }
}