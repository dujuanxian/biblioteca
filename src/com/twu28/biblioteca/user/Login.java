package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.Command;

import java.awt.*;

class Login {
    private boolean loginStatus = false;
    private String inputUsername;
    private String inputPassword;

    void login() {
        inputUsernameAndPassword();
        checkInputUsernameAndPassword();
    }

    String getInputUsername() {
        return inputUsername;
    }

    String getInputPassword() {
        return inputPassword;
    }

    boolean getLoginStatus() {
        return loginStatus;
    }

    private void inputUsernameAndPassword() {
        inputUsername = new Command().getNextString("Please input your username");
        inputPassword = new Command().getNextString("Please input your password");
    }

    void checkInputUsernameAndPassword() {
        if (isValidUsernameAndPassword())
            loginStatus = true;
        else
            notifyWrongLoginInfo();
    }

    private void notifyWrongLoginInfo() {
        Application.colorOutput.println("Wrong username or password!",
                Color.RED, Color.BLACK);
    }

    private boolean isValidUsernameAndPassword() {
        for (User userList : UserList.getUserList()) {
            if (userList.equals(inputUsername, inputPassword))
                return true;
        }
        return false;
    }
}