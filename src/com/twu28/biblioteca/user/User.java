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

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loginStatus =false;
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getCollectionList() {
        return collectionList;
    }

    public void login() {
        loginWithInputUserInfo(inputUsername());
    }

    private void loginWithInputUserInfo(String inputUsername) {
        String inputPassword = inputPassword();

        loginIfLogout(inputUsername, inputPassword);
        initializeUser(inputUsername, inputPassword);
    }

    private void initializeUser(String inputUsername, String inputPassword) {
        if (loginStatus) {
            this.username = inputUsername;
            this.password = inputPassword;
        }
    }

    private void loginIfLogout(String inputUsername, String inputPassword) {
        if (!loginStatus){
            if (isValidUsernameAndPassword(inputUsername, inputPassword))
                loginStatus = true;
            else
                notifyWrongLoginInfo();
        }
    }

    private boolean isValidUsernameAndPassword(String inputUsername, String inputPassword) {
        for (User userList : UserList.getUserList()) {
            if (userList.equals(inputUsername, inputPassword))
                return true;
        }
        return false;
    }

    private void notifyWrongLoginInfo() {
        /*
        * Why not tell the user which one of the two is wrong?
        */
        Application.colorOutput.println("Wrong username or password!",
                Color.RED, Color.BLACK);
    }

    private String inputPassword() {
        return new Command().getNextString("Please input your username");
    }

    private String inputUsername() {
        return new Command().getNextString("Please input your password");
    }

    boolean equals(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    void addBookToCollection(int bookNumber) {
        collectionList.add(BookList.getBookList().get(bookNumber - 1));
    }

    public boolean isLogin() {
        return loginStatus;
    }
}
