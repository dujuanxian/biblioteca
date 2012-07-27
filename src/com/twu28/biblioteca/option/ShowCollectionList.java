package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.user.User;

import java.awt.*;

public class ShowCollectionList extends Option {

    /*
    * Would this be an automatic login?
    */
    public void run(User currentUser) {
        if (currentUser.isLogin()) {
            showCollectionBooksIfLogin(currentUser);
        } else {
            ShowCollectionBooksAfterLogin(currentUser);
        }
    }

    private void ShowCollectionBooksAfterLogin(User currentUser) {
        currentUser.login();
        if(currentUser.isLogin())
            showCollectionBooksIfLogin(currentUser);
    }

    private void showCollectionBooksIfLogin(User currentUser) {
        int bookID = 1;
        for (Book collection : currentUser.getCollectionList()) {
            Application.colorOutput.println(bookID + ": <" + collection.getTitle() + ">, " + collection.getAuthor(),
                    Color.GREEN, Color.BLACK);
            bookID++;
        }
    }
}
