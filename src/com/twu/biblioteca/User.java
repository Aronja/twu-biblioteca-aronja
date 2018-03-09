package com.twu.biblioteca;

public class User {

    private String LibraryNumber;
    private String Password;
    private String Name;
    private String Email;
    private String Number;

    public User(String LibraryNumber,
                String Password,
                String Name,
                String Email,
                String Number){
        this.LibraryNumber = LibraryNumber;
        this.Password = Password;
        this.Name = Name;
        this.Email = Email;
        this.Number = Number;
    }

    public boolean authentication(String LibraryNumber, String Password){
        return LibraryNumber.equals(this.LibraryNumber) &&
                Password.equals(this.Password);
    }

    public String getDetails(){
        String details = "Name: " + Name + "\n" +
                "Email: " + Email + "\n" +
                "Number: " + Number + "\n";
        System.out.println(details);
        return details;
    }
}