package com.twu28.biblioteca;

import org.junit.Before;

public class CollectionTest {
    private Collection collection;

    @Before
    public void setup() {
        collection = new Collection();
        collection.run(new Library());
    }
}
