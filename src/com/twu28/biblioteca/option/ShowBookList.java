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
        new Reservation().reserveBook(getInputCommand(new Command()), currentUser);
    }

    private int getInputCommand(Command command) {
        return command.getNextInt("Input the number of book between 1 and " +
                BookList.getBookList().size() + "(input '0' back to option menu):");
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
