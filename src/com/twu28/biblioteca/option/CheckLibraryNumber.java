package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.user.User;

import java.awt.*;

class CheckLibraryNumber extends Option {

    public void run(User currentUser) {
        if (currentUser.isLogin())
            printLibraryNumber(currentUser);
        else
            notifyFailedNotification();
    }

    private void notifyFailedNotification() {
        Application.colorOutput.println("Please talk to Librarian. Thank you.",
                Color.RED, Color.BLACK);
    }

    private void printLibraryNumber(User currentUser) {
        Application.colorOutput.println(currentUser.getUsername(), Color.RED, Color.BLACK);
    }

}
