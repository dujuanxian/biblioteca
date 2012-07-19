package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.Library;

import java.awt.*;

class ShowCollectionList extends Option {

    public void run() {
        showCollectionBooks();
    }

    private void showCollectionBooks() {
        int bookID = 1;
        for (Book collection : Application.library.getCollectionList()) {
            Library.colorOutput.println(bookID + ": <" + collection.getTitle() + ">, " + collection.getAuthor(),
                    Color.GREEN, Color.BLACK);
            bookID++;
        }
    }
}
