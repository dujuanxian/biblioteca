package com.twu28.biblioteca.user;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.book.Book;
import com.twu28.biblioteca.book.BookList;

import java.awt.*;

public class Reservation {

    public void reserveBook(int bookNumber, User user) {
        if (user.isLogin()) 
            reserveBookIfLogin(bookNumber, user);
        else {
            reserveBookAfterLogin(bookNumber, user);
        }
    }

    private void reserveBookAfterLogin(int bookNumber, User user) {
        user.login();
        if(user.isLogin())
            reserveBookIfLogin(bookNumber, user);
    }

    private void reserveBookIfLogin(int bookNumber, User user) {
        if (!isValidBook(bookNumber)) {
            notifyFailedReservation();
        } else if (isReserved(bookNumber, user)) {
            notifyBookAlreadyReserved();
        } else {
            addBookToCollection(bookNumber, user);
        }
    }

    private void addBookToCollection(int bookNumber, User user) {
        user.addBookToCollection(bookNumber);
        notifySuccessReservation();
    }

    private Book getBook(int inputNumber) {
        return BookList.getBookList().get(inputNumber - 1);
    }

    private boolean isReserved(int bookNumber, User user) {
        return user.getCollectionList().contains(getBook(bookNumber));
    }

    private boolean isValidBook(int bookNumber) {
        return bookNumber > 0 && bookNumber <= BookList.getBookList().size();
    }

    private void notifyFailedReservation() {
        Application.colorOutput.println("Sorry we don't have that book yet.", Color.RED, Color.BLACK);
    }

    private void notifyBookAlreadyReserved() {
        Application.colorOutput.println("The book is already reserved!", Color.RED, Color.BLACK);
    }

    private void notifySuccessReservation() {
        Application.colorOutput.println("Thank You! Enjoy the book.", Color.RED, Color.BLACK);
    }
}