package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;

class CheckLibraryNumber extends Option {

    private Library library;

    public CheckLibraryNumber(Library library) {
        this.library = library;
    }

    public void run() {
        checkLibraryNumber();
    }

    private void checkLibraryNumber() {
        showCheckNotification();
    }

    private void showCheckNotification() {
        System.out.println("Please talk to Librarian. Thank you.");
    }
}
