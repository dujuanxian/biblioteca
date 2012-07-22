package com.twu28.biblioteca.user;

import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.BookList;

import java.util.*;
import java.util.List;

public class User {
    private List<Book> collectionList = new ArrayList<Book>();
    private String username;
    private String password;
    private Login login = new Login();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getCollectionList() {
        return collectionList;
    }

    public void loginIfLoggedOut() {
        if (!isLogin())
            login.login();
        if (isLogin()) {
            this.username = login.getInputUsername();
            this.password = login.getInputPassword();
        }
    }

    public boolean isLogin() {
        return login.getLoginStatus();
    }

    boolean equals(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    void addBookToCollection(int bookNumber) {
        collectionList.add(BookList.getBookList().get(bookNumber - 1));
    }
}
