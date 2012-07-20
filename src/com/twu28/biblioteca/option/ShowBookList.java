package com.twu28.biblioteca.option;

import com.twu28.biblioteca.*;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.Reservation;

import java.awt.*;

class ShowBookList extends Option {

    private static final int BACK_TO_MENU = 0;

    public void run() {
        showAllBooks();
        int inputNumber = getInputCommand(new Command());
        if(!isBackToMenu(inputNumber) && !isLogin()){
            logInLibrary();
        }
        if(isLogin())
            new Reservation(Application.library).reserveBook(inputNumber);
    }

    private void logInLibrary() {
        Application.library.logInLibrary();
    }

    private boolean isLogin() {
        return Application.library.isLogIn();
    }

    private boolean isBackToMenu(int inputNumber) {
        return BACK_TO_MENU == inputNumber;
    }

    private int getInputCommand(Command command) {
        int inputNumber = command.getNextInt("Input the number of book between 1 and " +
                Application.library.getBookListSize() + "(input '0' back to option menu):");
        while (!isValidOption(inputNumber))
            inputNumber = command.getNextInt("Wrong number, try again.");
        return inputNumber;
    }

    private boolean isValidOption(int inputNumber) {
        return inputNumber >= BACK_TO_MENU && inputNumber <= Application.library.getBookListSize();
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
