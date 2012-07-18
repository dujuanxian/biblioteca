package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookDataBase {
    private List<Book> bookList = new ArrayList<Book>();

    public BookDataBase() {
        bookList.add(new Book("111", "Refactoring", "Martin Fowler"));
        bookList.add(new Book("222", "Thinking in Java", "Bruce Eckel"));
        bookList.add(new Book("333", "Clean Code", "Robert C. Martin"));
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
