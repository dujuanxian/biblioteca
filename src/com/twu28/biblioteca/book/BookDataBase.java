package com.twu28.biblioteca.book;

import java.util.ArrayList;
import java.util.List;

class BookDataBase {
    private List<Book> bookList = new ArrayList<Book>();

    BookDataBase() {
        bookList.add(new Book("111", "Refactoring", "Martin Fowler"));
        bookList.add(new Book("222", "Thinking in Java", "Bruce Eckel"));
        bookList.add(new Book("333", "Clean Code", "Robert C. Martin"));
    }

    List<Book> getBookList() {
        return bookList;
    }
}
