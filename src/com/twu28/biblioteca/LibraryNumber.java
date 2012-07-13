package com.twu28.biblioteca;

class LibraryNumber extends Option{

    private void checkLibraryNumber()
    {
        showCheckNotification();
    }

    private void showCheckNotification() {
        System.out.println("Please talk to Librarian. Thank you.");
    }

    void run(Library library) {
        checkLibraryNumber();
    }
}
