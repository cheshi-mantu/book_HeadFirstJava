package ch2;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.title = "The silence of the lambs";
        firstMovie.genre = "thriller";
        firstMovie.rating = 8;

        Movie secondMovie = new Movie();
        secondMovie.title = "The good, the bad, the ugly";
        secondMovie.genre = "western";
        secondMovie.rating = 9;
        secondMovie.playIt();

        Movie thirdMovie = new Movie();
        thirdMovie.title = "The Terror";
        thirdMovie.genre = "scary";
        thirdMovie.rating = 6;





    }

}
