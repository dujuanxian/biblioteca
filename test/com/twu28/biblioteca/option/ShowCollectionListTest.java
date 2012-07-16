package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowCollectionListTest {
    private ShowCollectionList showCollectionList;

    @Before
    public void setup() {
        showCollectionList = new ShowCollectionList(new Library());
        showCollectionList.run();
    }
    
    @Test
    public void collectionBookNumberWithoutReservationIs0()
    {
        int collectionNumber = showCollectionList.library.getCollectionList().size();
        assertThat(collectionNumber, is(0));
    }
}
