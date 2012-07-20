package com.twu28.biblioteca.book;

import com.twu28.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReservationTest {

    private Reservation reservation;
    private Library library;

    @Before
    public void setup()
    {
        library = new Library();
        reservation = new Reservation(library);
    }

    @Test
    public void numberOfCollectionListWithoutReservation() {
        assertThat(library.getCollectionList().size(), is(0));
    }
    @Test
    public void numberOfCollectionListAfterReserveTheFirstBook() {
        int bookNumber = 1;
        Book book = reservation.selectBook(1);
        if (reservation.isValidBookNumber(bookNumber))
            reservation.reserveValidBook(book);
        else
            reservation.notifyFailedReservation();
        assertThat(library.getCollectionList().size(), is(1));
        assertThat(library.getCollectionList().get(0).getIsbn(), is("111"));
    }
    @Test
    public void numberOfCollectionListAfterReserve2Books() {
        Book book1 = reservation.selectBook(1);
        if (reservation.isValidBookNumber(1))
            reservation.reserveValidBook(book1);
        else
            reservation.notifyFailedReservation();
        Book book = reservation.selectBook(2);
        if (reservation.isValidBookNumber(2))
            reservation.reserveValidBook(book);
        else
            reservation.notifyFailedReservation();
        assertThat(library.getCollectionList().size(), is(2));
    }

    @Test
    public void numberOfBooksIsSelectNotAvailableBookIs0() {
        Book collectionBook = new Book("444", "", "");
        if (reservation.isValidBookNumber(1))
            reservation.reserveValidBook(collectionBook);
        else
            reservation.notifyFailedReservation();
        assertThat(library.getCollectionList().size(), is(0));
    }

    @Test
    public void numberOfCollectionWithInvalidSelectionIs0() {
        Book selectedBook = reservation.selectBook(4);
        assertThat(selectedBook, is((Book) null));
    }


}
