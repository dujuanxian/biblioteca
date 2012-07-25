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
    private String inputUsername;
    private String inputPassword;

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

    private void initializeUser() {
        if (isValidUser()) {
            this.username = inputUsername;
            this.password = inputPassword;
            loginStatus = true;
        }
    }

    private void inputUsernameAndPassword() {
        inputUsername = inputUsername();
        inputPassword = inputPassword();
    }

    private boolean isValidUser() {
        return isValidUsername() && isValidPassword();
    }

    private boolean isValidPassword() {
        for (User aUser : UserList.getUserList())
            if (aUser.isUsername(inputUsername) && aUser.isPassword(inputPassword))
                return true;
        notifyWrongPassword();
        return false;
    }

    private boolean isValidUsername() {
        for (User aUser : UserList.getUserList())
            if (aUser.isUsername(inputUsername))
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

    private void notifyWrongUsername() {
        Application.colorOutput.println("Wrong username!", Color.RED, Color.BLACK);
    }

    private String inputUsername() {
        return new Command().getNextString("Please input your username");
    }

    private String inputPassword() {
        return new Command().getNextString("Please input your password");
    }

    void addBookToCollection(int bookNumber) {
        collectionList.add(BookList.getBookList().get(bookNumber - 1));
    }

    public boolean isLogin() {
        return loginStatus;
    }
}
