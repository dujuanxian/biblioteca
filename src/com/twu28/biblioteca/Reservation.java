package com.twu28.biblioteca;

class Reservation {
    private Library library;

    public Reservation(Library library) {
        this.library = library;
    }

    Book selectBook(int number) {
        if (isValidBookNumber(number))
            return library.getBookList().get(number - 1);
        return null;
    }

    void reserveBook(Book book) {
        if (isValidBook(book))
            reserveValidBook(book);
        else
            notifyFailedReservation();
    }

    private boolean isValidBookNumber(int number) {
        return number > 0 && number <= library.getBookList().size();
    }

    private boolean isValidBook(Book book) {
        return library.getBookList().contains(book);
    }

    private void notifyFailedReservation() {
        System.out.println("Sorry we don't have that book yet.");

    }

    private void reserveValidBook(Book book) {
        library.getCollectionList().add(book);
        notifySuccessReservation();
    }

    private void notifySuccessReservation() {
        System.out.println("Thank You! Enjoy the book.");
    }

}
