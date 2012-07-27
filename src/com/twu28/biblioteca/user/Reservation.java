package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.Command;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.BookList;

import java.awt.*;

public class Reservation {

    private User user;

    public void reserveBook() {
        int bookNumber = getInputCommand(new Command());
        if (user.isLogin()) {
            reserveBookIfLogin(bookNumber);
        } else {
            reserveBookAfterLogin(bookNumber);
        }
    }

    private void reserveBookAfterLogin(int bookNumber) {
        user.login();
        if (user.isLogin())
            reserveBookIfLogin(bookNumber);
    }

    void reserveBookIfLogin(int bookNumber) {
        if (!isValidBook(bookNumber)) {
            notifyFailedReservation();
        } else if (isReserved(bookNumber)) {
            notifyBookAlreadyReserved();
        } else {
            addBookToCollection(bookNumber);
        }
    }

    private int getInputCommand(Command command) {
        return command.getNextInt("Input the number of book between 1 and " +
                BookList.getBookList().size() + "(input '0' back to option menu):");
    }

    private void addBookToCollection(int bookNumber) {
        user.addBookToCollection(bookNumber);
        notifySuccessReservation();
    }

    private Book getBook(int inputNumber) {
        return BookList.getBookList().get(inputNumber - 1);
    }

    private boolean isReserved(int bookNumber) {
        return user.getCollectionList().contains(getBook(bookNumber));
    }

    private boolean isValidBook(int bookNumber) {
        return bookNumber > 0 && bookNumber <= BookList.getBookList().size();
    }

    void notifyFailedReservation() {
        Application.colorOutput.println("Sorry we don't have that book yet.", Color.RED, Color.BLACK);
    }

    private void notifyBookAlreadyReserved() {
        Application.colorOutput.println("The book is already reserved!", Color.RED, Color.BLACK);
    }

    private void notifySuccessReservation() {
        Application.colorOutput.println("Thank You! Enjoy the book.", Color.RED, Color.BLACK);
    }


    public void setUser(User user) {
        this.user = user;
    }
}