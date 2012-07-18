package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Book;
import com.twu28.biblioteca.Command;
import com.twu28.biblioteca.Library;
import com.twu28.biblioteca.Reservation;

import java.awt.*;

class ShowBookList extends Option {

    private Library library;

    public ShowBookList(Library library) {
        this.library = library;
    }

    public void run() {
        showAllBooks();
        reserveBook();
    }

    private void reserveBook() {
        System.out.println("Input the number of book to reserve(input '0' back to option menu):");
        int inputNumber = getInputNumber();
        while (!isValidNumberOfBookList(inputNumber)) {
            Library.colorOutput.println(inputNumber + " is not a valid number, please input the number of " +
                    "book again or input '0' back to the option menu ", Color.RED, Color.BLACK);
            inputNumber = getInputNumber();
        }
        if (0 != inputNumber)
            reserveSelectedBook(inputNumber);
    }

    private int getInputNumber() {
        return Command.getCommand();
    }

    private void reserveSelectedBook(int inputNumber) {
        Reservation reservation = new Reservation(library);
        Book selectedBook = reservation.selectBook(inputNumber);
        reservation.reserveBook(selectedBook);
    }

    private boolean isValidNumberOfBookList(int inputNumber) {
        if (inputNumber >= 0 && inputNumber <= library.getBookList().size())
            return true;
        return false;
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
