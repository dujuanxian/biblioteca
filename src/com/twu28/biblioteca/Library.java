package com.twu28.biblioteca;

import com.twu28.biblioteca.option.Option;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<Book>();
    private List<Book> collectionList = new ArrayList<Book>();
    private int optionNumber;
    public static ColorOutput colorOutput = new ColorOutput();

    public Library() {
        bookList.addAll(new BookDataBase().getBookList());
    }

    void showMenuOptions() {
        startApplication();
        selectOptionNumber();
        runMenuOption();
    }

    void showWelcomeInterface() {
        System.out.println("Welcome to the Bilioteca Library.");
    }

    private void startApplication() {
        colorOutput.println("1: View all the books", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("2: View collections", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("3: Check Library Number", Color.LIGHT_GRAY, Color.BLACK);
        colorOutput.println("4: Quit Application", Color.LIGHT_GRAY, Color.BLACK);
    }

    private void runMenuOption() {
        Option option = Option.createOption(optionNumber, this);
        option.run();
    }

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
}
