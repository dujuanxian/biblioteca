package com.twu28.biblioteca;

import java.util.Scanner;

/*
 * Have a look at Mockito and see whether it can help you testing this class.
 */
public class Command {
    public static int getCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}