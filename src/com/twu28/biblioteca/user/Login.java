package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Application;

import java.awt.*;

/*
 * Why did you choose to have both a Login class and a User class?
 *
 */
class Login {
    boolean loginStatus = false;

    void login(String inputUsername, String inputPassword) {
        if (isValidUsernameAndPassword(inputUsername, inputPassword))
            loginStatus = true;
        else
            notifyWrongLoginInfo();
    }

    boolean getLoginStatus() {
        /*
        * What is the purpose of this method, where are you using it?
        */
        return loginStatus;
    }

    private void notifyWrongLoginInfo() {
        /*
        * Why not tell the user which one of the two is wrong?
        */
        Application.colorOutput.println("Wrong username or password!",
                Color.RED, Color.BLACK);
    }

    private boolean isValidUsernameAndPassword(String inputUsername, String inputPassword) {
        for (User userList : UserList.getUserList()) {
            if (userList.equals(inputUsername, inputPassword))
                return true;
        }
        return false;
    }
}