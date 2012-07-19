package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;

abstract public class Option {
    public static final int SHOW_BOOK_LIST = 1;
    public static final int SHOW_COLLECTION_LIST = 2;
    public static final int SHOW_MOVIE_LIST = 3;
    public static final int CHECK_LIBRARY_NUMBER = 4;
    public static final int QUIT_APPLICATION = 5;
    public static final int TOTAL_OPTION_NUMBER = 5;

    public static Option createOption(int optionNumber) {
        switch (optionNumber)
        {
            case SHOW_BOOK_LIST:
                return new ShowBookList();
            case SHOW_COLLECTION_LIST:
                return new ShowCollectionList();
            case SHOW_MOVIE_LIST:
                return new ShowMovieList();
            case CHECK_LIBRARY_NUMBER:
                return new CheckLibraryNumber();
            case QUIT_APPLICATION:
                return new QuitApplication();
            default:
                throw new IllegalArgumentException("Ignore option number");
        }
    }

    public abstract void run();
}
