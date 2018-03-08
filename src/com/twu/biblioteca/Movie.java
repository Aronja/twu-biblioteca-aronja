package com.twu.biblioteca;

public class Movie implements LibraryItem {

    private String Title;
    private String Director;
    private String Rating;
    private int Year;

    public Movie(String Title,
                 String Director,
                 String Rating,
                 int Year){

        this.Title = Title;
        this.Director = Director;
        this.Rating = Rating;
        this.Year = Year;

    }


    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public String getDetails() {
        String details = this.Title + " | " +
                this.Director + " | " +
                this.Rating + " | " +
                this.Year;
        return details;
    }
}