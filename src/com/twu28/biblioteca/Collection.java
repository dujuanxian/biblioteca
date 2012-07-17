package com.twu28.biblioteca;

import java.awt.*;
import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.ArrayList;
import java.util.List;

/*
 * Can you find a better name for Collection (other than CollectionOption please :)
 */
class Collection extends Option {

    /*
     * State is the root of all evil (well, almost)
     */
    private Library library;

    void run(Library library) {
        this.library = library;
        showCollectionBooks();
    }

    private void showCollectionBooks() {
        int bookID = 1;
        for (Book collection : library.getCollectionList()) {
            Library.colorOutput.println(bookID + ": <" + collection.getTitle() +">, "+ collection.getAuthor(),
                    Color.GREEN, Color.BLACK);
            bookID++;
        }
    }
}
