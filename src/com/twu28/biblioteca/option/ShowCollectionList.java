package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Book;
import com.twu28.biblioteca.Library;

import java.awt.*;

class ShowCollectionList extends Option {

    Library library;

    public ShowCollectionList(Library library) {
        this.library = library;
    }

    public void run() {
        showCollectionBooks();
    }

    private void showCollectionBooks() {
        int bookID = 1;
        for (Book collection : library.getCollectionList()) {
            Library.colorOutput.println(bookID + ": <" + collection.getTitle() + ">, " + collection.getAuthor(),
                    Color.GREEN, Color.BLACK);
            bookID++;
        }
    }
}
