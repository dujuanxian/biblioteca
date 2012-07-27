package com.twu28.biblioteca.user;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ReservationTest {
    private Reservation reservation;
    private User mockUser;

    @Before
    public void setup(){
        reservation = new Reservation();
        mockUser = mock(User.class);
    }
    
    @Test
    public void testReserveValidBookIfHasLogin(){
        reservation.setUser(mockUser);
        reservation.reserveBookIfLogin(1);
        reservation.reserveBookIfLogin(2);
        verify(mockUser, times(1)).addBookToCollection(1);
        verify(mockUser, times(1)).addBookToCollection(2);
    }
//    @Test
//    public void testReserveExistedBookIfHasLogin(){
//        reservation.setUser(mockUser);
//        reservation.reserveBookIfLogin(1);
//        reservation.reserveBookIfLogin(1);
//        verify(mockUser, times(1)).addBookToCollection(1);
//    }
    @Test
    public void testReserveInvalidBookIfHasLogin(){
        reservation.setUser(mockUser);
        reservation.reserveBookIfLogin(999);
        verify(mockUser, never()).addBookToCollection(999);
    }
}
