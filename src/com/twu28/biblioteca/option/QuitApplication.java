package com.twu28.biblioteca.option;

import com.twu28.biblioteca.Library;

class QuitApplication extends Option {
    private Library library;

    public QuitApplication(Library library) {
        this.library = library;
    }

    public void run() {
        System.exit(-1);
    }
}
