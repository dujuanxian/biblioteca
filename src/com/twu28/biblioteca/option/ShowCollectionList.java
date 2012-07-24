package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.user.User;

import java.awt.*;

class ShowCollectionList extends Option {

    /*
    * Would this be an automatic login?
    */
    public void run(User currentUser) {
        currentUser.login();
        if (currentUser.isLogin())
            showCollectionBooks(currentUser);
    }

    private void showCollectionBooks(User currentUser) {
        int bookID = 1;
        for (Book collection : currentUser.getCollectionList()) {
            Application.colorOutput.println(bookID + ": <" + collection.getTitle() + ">, " + collection.getAuthor(),
                    Color.GREEN, Color.BLACK);
            bookID++;
        }
    }
}
