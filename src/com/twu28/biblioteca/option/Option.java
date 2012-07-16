package com.twu28.biblioteca.option;

import com.twu28.biblioteca.*;

public abstract class Option {
    static final int BOOK_LIST = 1;
    static final int COLLECTION_LIST = 2;
    static final int LIBRARY_NUMBER = 3;
    static final int QUIT_APPLICATION = 4;

    public static Option createOption(int optionNumber, Library library) {
        switch (optionNumber) {
            case BOOK_LIST:
                return new ShowBookList(library);
            case LIBRARY_NUMBER:
                return new CheckLibraryNumber(library);
            case COLLECTION_LIST:
                return new ShowCollectionList(library);
            case QUIT_APPLICATION:
                return new QuitApplication(library);
            default:
                throw new IllegalArgumentException("Ignore option number");
        }
    }

    public abstract void run();
}