package com.twu.biblioteca;

import java.util.ArrayList;


public class managingUsers {
    private ArrayList<User> users;
    private User currentUser;

    public managingUsers(){
        users = new ArrayList<User>();
    }

    public void addUsers(User... usersToAdd){
        for(User user : usersToAdd){
            users.add(user);
        }
    }

    public boolean logIn(String LibraryNumber, String Password){
        for(User user : users){
            if(user.authentication(LibraryNumber, Password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }
}