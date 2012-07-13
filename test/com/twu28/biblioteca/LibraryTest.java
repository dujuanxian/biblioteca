package com.twu28.biblioteca;

import org.junit.Before;

public class LibraryTest {
    private Library myLibrary;

    @Before
    public void setup()
    {
        myLibrary = new Library();
        myLibrary.showWelcomeInterface();
        myLibrary.showMenuOptions();
    }
}
