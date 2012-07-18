package com.twu28.biblioteca;

public class Movie {
    private String name;
    private String director;
    private String rating;

    public Movie(String name, String director, String rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    public void setRate() {
        rating = "1";
    }
}
