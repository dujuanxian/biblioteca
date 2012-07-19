package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import com.twu28.biblioteca.Library;

import java.awt.*;

class CheckLibraryNumber extends Option {

    public void run() {
        checkLibraryNumber();
    }

    private void checkLibraryNumber() {
        showCheckNotification();
    }

    private void showCheckNotification() {
        if (Application.library.isLogIn())
            Library.colorOutput.println(Application.library.getUserName(),
                    Color.RED, Color.BLACK);
        else
            Library.colorOutput.println("Please talk to Librarian. Thank you.",
                    Color.RED, Color.BLACK);
    }
}
