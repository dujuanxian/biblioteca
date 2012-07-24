package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Application;

import java.awt.*;

class Login {
    boolean loginStatus = false;

    void login(String inputUsername, String inputPassword) {
        if (isValidUsernameAndPassword(inputUsername, inputPassword))
            loginStatus = true;
        else
            notifyWrongLoginInfo();
    }

    boolean getLoginStatus() {
        return loginStatus;
    }

    private void notifyWrongLoginInfo() {
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