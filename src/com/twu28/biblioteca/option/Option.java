package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;

abstract public class Option {
    private static final int SHOW_BOOK_LIST = 1;
    private static final int SHOW_LIBRARY_NUMBER = 2;
    private static final int CHECK_COLLECTION_NUMBER = 3;
    private static final int QUIT_APPLICATION = 4;

    public static Option createOption(int optionNumber, Library library) {
        switch (optionNumber)
        {
            case SHOW_BOOK_LIST:
                return new ShowBookList(library);
            case SHOW_LIBRARY_NUMBER:
                return new ShowCollectionList(library);
            case CHECK_COLLECTION_NUMBER:
                return new CheckLibraryNumber(library);
            case QUIT_APPLICATION:
                return new QuitApplication(library);
            default:
                throw new IllegalArgumentException("Ignore option number");
        }
    }
    
    public abstract void run();
}
