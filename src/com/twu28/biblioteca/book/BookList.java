package com.twu28.biblioteca.book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList = new ArrayList<Book>();

    private BookList() {
        bookList.addAll(new BookDataBase().getBookList());
    }

    public static List<Book> getBookList() {
        return new BookList().bookList;
    }
}