package com.twu28.biblioteca.option;

import com.twu28.biblioteca.*;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.BookList;
import com.twu28.biblioteca.user.Reservation;
import com.twu28.biblioteca.user.User;

import java.awt.*;

public class ShowBookList extends Option {

    public void run(User currentUser) {
        showAllBooks();
        reserveSelectedBook(currentUser);
    }

    private void reserveSelectedBook(User currentUser) {
        Reservation reservation = new Reservation();
        reservation.setUser(currentUser);
        reservation.reserveBook();
    }

    public void showAllBooks() {
        int bookID = 1;
        for (Book book : BookList.getBookList()) {
            Application.colorOutput.println(bookID + ": <" + book.getTitle() + "> " + book.getAuthor(),
                    Color.ORANGE, Color.BLACK);
            bookID++;
        }
    }
}
