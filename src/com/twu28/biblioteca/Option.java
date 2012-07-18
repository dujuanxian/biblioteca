package com.twu28.biblioteca;

abstract class Option {
    static final int BOOK_LIST = 1;
    static final int COLLECTION_LIST = 2;
    static final int LIBRARY_NUMBER = 3;
    static final int QUIT = 4;

    /*
     * Could this be unit tested?
     */
    static Option createOption(int optionNumber) {
        switch (optionNumber)
        {
            case BOOK_LIST:
                return new BookList();
            case LIBRARY_NUMBER:
                return new LibraryNumber();
            case COLLECTION_LIST:
                return new Collection();
            case QUIT:
                return new Quit();
            default:
                throw new IllegalArgumentException("Ignore option number");
        }
    }

    abstract void run(Library library);
}