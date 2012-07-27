package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.Command;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.BookList;

import java.awt.*;
import java.util.*;
import java.util.List;

public class User {
    private List<Book> collectionList = new ArrayList<Book>();
    private String username;
    private String password;
    private boolean loginStatus;
    private String inputtedUsername;
    private String inputtedPassword;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loginStatus = false;
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getCollectionList() {
        return collectionList;
    }

    public void login() {
        inputUsernameAndPassword();
        initializeUser();
    }

    void initializeUser() {
        if (isValidUser()) {
            this.username = inputtedUsername;
            this.password = inputtedPassword;
            loginStatus = true;
        }
    }

    private void inputUsernameAndPassword() {
        inputUsername(new Command());
        inputPassword(new Command());
    }

    private boolean isValidUser() {
        return isValidUsername() && isValidPassword();
    }

    private boolean isValidPassword() {
        for (User aUser : UserList.getUserList())
            if (aUser.isUsername(inputtedUsername) && aUser.isPassword(inputtedPassword))
                return true;
        notifyWrongPassword();
        return false;
    }

    private boolean isValidUsername() {
        for (User aUser : UserList.getUserList())
            if (aUser.isUsername(inputtedUsername))
                return true;
        notifyWrongUsername();
        return false;
    }

    private boolean isPassword(String password) {
        return this.password.equals(password);
    }

    private boolean isUsername(String username) {
        return this.username.equals(username);
    }

    private void notifyWrongPassword() {
        Application.colorOutput.println("Wrong password!", Color.RED, Color.BLACK);
    }

    public void notifyWrongUsername() {
        Application.colorOutput.println("Wrong username!", Color.RED, Color.BLACK);
    }

    public void inputUsername(Command command) {
        inputtedUsername = command.getNextString("Please input your username");
    }

    public void inputPassword(Command command) {
        inputtedPassword = command.getNextString("Please input your password");
    }

    void addBookToCollection(int bookNumber) {
        collectionList.add(BookList.getBookList().get(bookNumber - 1));
    }

    public boolean isLogin() {
        return loginStatus;
    }

    public String getInputtedUsername() {
        return inputtedUsername;
    }
}
