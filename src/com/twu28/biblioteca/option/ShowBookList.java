package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Book;
import com.twu28.biblioteca.Command;
import com.twu28.biblioteca.Library;
import com.twu28.biblioteca.Reservation;

import java.awt.*;

class ShowBookList extends Option {

    Library library;

    public ShowBookList(Library library) {
        this.library = library;
    }

    public void run() {
        showAllBooks();
        reserveBook();
    }

    private void reserveBook() {
        System.out.println("Input the number of the book to reserve:");
        Reservation reservation = new Reservation(library);
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
