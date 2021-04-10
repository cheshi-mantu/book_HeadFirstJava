package ch2;

import static helpers.OutputEasy.lprint;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        lprint("Playing the movie " + title);
    }

}
