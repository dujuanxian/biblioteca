package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Application;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowCollectionListTest {
    private ShowCollectionList showCollectionList;

    @Before
    public void setup() {
        showCollectionList = new ShowCollectionList();
        showCollectionList.run();
    }
    
    @Test
    public void collectionBookNumberWithoutReservationIs0()
    {
        int collectionNumber = Application.library.getCollectionList().size();
        assertThat(collectionNumber, is(0));
    }
}
