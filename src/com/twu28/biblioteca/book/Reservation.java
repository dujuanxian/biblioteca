package com.twu28.biblioteca.book;

import com.twu28.biblioteca.Library;

import java.awt.*;

public class Reservation {
    private Library library;

    public Reservation(Library library) {
        this.library = library;
    }

    public Book selectBook(int number) {
        if (isValidBookNumber(number))
            return library.getBookList().get(number - 1);
        return null;
    }

    public void reserveBook(Book book) {
        if (isValidBook(book))
            reserveValidBook(book);
        else
            notifyFailedReservation();
    }

    private boolean isValidBookNumber(int number) {
        return number > 0 && number <= library.getBookList().size();
    }

    private boolean isValidBook(Book book) {
        return library.getBookList().contains(book);
    }

    private void notifyFailedReservation() {
        Library.colorOutput.println("Sorry we don't have that book yet.", Color.RED, Color.BLACK);
    }

    private void reserveValidBook(Book book) {
        library.addBookToCollectionList(book);
        notifySuccessReservation();
    }

    private void notifySuccessReservation() {
        Library.colorOutput.println("Thank You! Enjoy the book.", Color.RED, Color.BLACK);
    }

}
