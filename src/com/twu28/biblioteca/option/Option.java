package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;

abstract public class Option {
    public static final int SHOW_BOOK_LIST = 1;
    public static final int SHOW_COLLECTION_LIST = 2;
    public static final int SHOW_MOVIE_LIST = 3;
    public static final int CHECK_LIBRARY_NUMBER = 4;
    public static final int QUIT_APPLICATION = 5;

    public static Option createOption(int optionNumber, Library library) {
        switch (optionNumber)
        {
            case SHOW_BOOK_LIST:
                return new ShowBookList(library);
            case SHOW_COLLECTION_LIST:
                return new ShowCollectionList(library);
            case SHOW_MOVIE_LIST:
                return new ShowMovieList(library);
            case CHECK_LIBRARY_NUMBER:
                return new CheckLibraryNumber(library);
            case QUIT_APPLICATION:
                return new QuitApplication(library);
            default:
                throw new IllegalArgumentException("Ignore option number");
        }
    }
        
    public abstract void run();
}
