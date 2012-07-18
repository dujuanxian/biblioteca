package com.twu28.biblioteca;

import com.twu28.biblioteca.option.Option;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<Book>();
    private List<Book> collectionList = new ArrayList<Book>();
    private List<Movie> movieList = new ArrayList<Movie>();

    /*
     * Is optionNumber required? Could there be a different design?
     */
    private int optionNumber;

    public static ColorOutput colorOutput = new ColorOutput();

    public Library() {
        bookList.addAll(new BookDataBase().getBookList());
        movieList.addAll(new MovieDataBase().getMovieList());
    }

    void showMenuOptions() {
        /*
         * Good separation of steps.
         *
         * Separation of concerns is *the* single most important guideline when building IT systems.
         */
        startApplication();
        selectOptionNumber();
        runMenuOption();
    }

    void showWelcomeInterface() {
        colorOutput.println("Welcome to the Bilioteca Library.", Color.RED, Color.BLACK);
    }

    private void startApplication() {
        colorOutput.println("1: View all the books", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("2: View book collections", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("3: View all the movies", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("4: Check Library Number", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("5: Quit Application", Color.LIGHT_GRAY, Color.BLACK);
    }

    private void runMenuOption() {
        Option option = Option.createOption(optionNumber, this);
        option.run();
    }

    /*
     * Which price is paid for private visibility?
     */
    private void selectOptionNumber() {
        System.out.println("Input the number of the menu option:");
        optionNumber = Command.getCommand();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> getCollectionList() {
        return collectionList;
    }

    public void addBookToCollectionList(Book book) {
        if (!collectionList.contains(book))
            collectionList.add(book);
        else
            colorOutput.println("The book is already reserved!", Color.RED, Color.BLACK);
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
