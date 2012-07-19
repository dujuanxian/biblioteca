package com.twu28.biblioteca.login;

import com.twu28.biblioteca.Library;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Login {

    private List<User> userList = new ArrayList<User>();
    private boolean loginStatus = false;
    private User currentUser;

    public Login(){
        userList.addAll(new UserDataBase().getUserList());
    }

    public void logInLibrary(String username, String password) {
        if(isMatch(username, password)){
            createUser(username, password);
        } else {
            notifyWrongLoginInfo();
        }
    }

    private void notifyWrongLoginInfo() {
        Library.colorOutput.println("Wrong username or password!",
                Color.RED, Color.BLACK);
    }

    private void createUser(String username, String password) {
        loginStatus = true;
        currentUser = new User(username, password);
    }

    private boolean isMatch(String username, String password) {
        for(User users : userList){
            if(users.match(username,password)){
                return true;
            }
        }
        return false;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }

    public String getUserName() {
        if(loginStatus)
            return currentUser.getUsername();
        return null;
    }
}
