package com.twu28.biblioteca;

import org.junit.Before;

public class LibraryNumberTest {
    @Before
    public void setup()
    {
        Option libraryNumber = Option.createOption(Option.LIBRARY_NUMBER);
        libraryNumber.run(new Library());
    }
}
