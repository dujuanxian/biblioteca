package com.twu28.biblioteca.option;

import com.twu28.biblioteca.*;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.Reservation;

import java.awt.*;

class ShowBookList extends Option {

    private static final int BACK_TO_MENU = 0;

    public void run() {
        showAllBooks();
        reserveBook();
    }

    private void reserveBook() {
        int inputNumber = getBookNumber(new Command());
        if (!isBackToMenu(inputNumber)) {
            if (Application.library.isLogIn()) {
                reserveSelectedBook(inputNumber);
            } else {
                Application.library.logInLibrary();
                if(Application.library.isLogIn())
                    reserveSelectedBook(inputNumber);
            }
        }
    }

    private boolean isBackToMenu(int inputNumber) {
        return BACK_TO_MENU == inputNumber;
    }

    private int getBookNumber(Command command) {
        int inputNumber = command.getNextInt("Input the number of book between 1 and " +
                Application.library.getBookListSize() + "(input '0' back to option menu):");
        while (!isValidOption(inputNumber))
            inputNumber = command.getNextInt("Wrong number, try again.");
        return inputNumber;
    }

    private boolean isValidOption(int inputNumber) {
        return inputNumber >= BACK_TO_MENU && inputNumber <= Application.library.getBookListSize();
    }

    private void reserveSelectedBook(int inputNumber) {
        Reservation reservation = new Reservation(Application.library);
        Book selectedBook = reservation.selectBook(inputNumber);
        reservation.reserveBook(selectedBook);
    }

    private void showAllBooks() {
        int bookID = 1;
        for (Book book : Application.library.getBookList()) {
            Library.colorOutput.println(bookID + ": <" + book.getTitle() + "> " + book.getAuthor(),
                    Color.ORANGE, Color.BLACK);
            bookID++;
        }
    }
}
