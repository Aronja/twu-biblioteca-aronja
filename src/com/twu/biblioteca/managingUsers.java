package com.twu.biblioteca;

import java.util.ArrayList;


public class managingUsers {
    private ArrayList<User> users;
    private User currentUser;

    public managingUsers(){
        users = new ArrayList<User>();
    }

    public void addUsers(User... usersToAdd){
        for(User u : usersToAdd){
            users.add(u);
        }
    }

    public boolean logIn(String libraryNumber, String password){
        for(User u : users){
            if(u.authentication(libraryNumber, password)) {
                currentUser = u;
                return true;
            }
        }
        return false;
    }
}