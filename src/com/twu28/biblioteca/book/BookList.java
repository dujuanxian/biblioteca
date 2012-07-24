package com.twu28.biblioteca.book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList = new ArrayList<Book>();

    private BookList() {
        bookList.add(new Book("111", "Refactoring", "Martin Fowler"));
        bookList.add(new Book("222", "Thinking in Java", "Bruce Eckel"));
        bookList.add(new Book("333", "Clean Code", "Robert C. Martin"));
    }

    public static List<Book> getBookList() {
        return new BookList().bookList;
    }
}