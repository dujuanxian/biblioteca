package com.twu28.biblioteca;

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
        reservation.reserveBook(reservation.selectBook(1));
        assertThat(library.getCollectionList().size(), is(1));
        assertThat(library.getCollectionList().get(0).getIsbn(), is("111"));
    }
    @Test
    public void numberOfCollectionListAfterReserve2Books() {
        reservation.reserveBook(reservation.selectBook(1));
        reservation.reserveBook(reservation.selectBook(2));
        assertThat(library.getCollectionList().size(), is(2));
    }

    @Test
    public void numberOfBooksIsSelectNotAvailableBookIs0() {
        Book collectionBook = new Book("444", "", "");
        reservation.reserveBook(collectionBook);
        assertThat(library.getCollectionList().size(), is(0));
    }

    @Test
    public void numberOfCollectionWithInvalidSelectionIs0() {
        Book selectedBook = reservation.selectBook(4);
        assertThat(selectedBook, is((Book) null));
    }


}
