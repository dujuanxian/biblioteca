package com.twu28.biblioteca;

import java.awt.*;
import java.util.List;

class BookList extends Option{

    Library library;

    List<Book> getList() {
        return library.getBookList();
    }

    void run(Library library){
        this.library = library;
        showAllBooks();
        reserveBook();
    }

    private void reserveBook() {
        System.out.println("Input the number of the book to reserve:");
        Reservation reservation =  new Reservation(library);
        Book selectedBook = reservation.selectBook(Command.getCommand());
        reservation.reserveBook(selectedBook);
    }

    private void showAllBooks() {
        int bookID = 1;
        for (Book book : library.getBookList()) {
            Library.colorOutput.println(bookID + ": <" + book.getTitle() + "> " + book.getAuthor(),
                    Color.ORANGE, Color.BLACK);
            bookID++;
        }
    }
}
