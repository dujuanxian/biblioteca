package com.twu28.biblioteca.movie;

/*
 * How easy or difficult did you find implementing the new requirements coming with the second assignment?
 *
 * Where did you have to change your previous design?
 *
 */

public class Movie {
    private String name;
    private String director;
    /*
     * Why did you choose a String as a rating? What are the pros and cons here?
     */
    private String rating;

    Movie(String name, String director, String rating) {
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
}
