package ch2;

import static helpers.OutputEasy.lprint;
import static helpers.RandomValues.getRandomInt;

public class GuessGame {
    GuessGamePlayer p1;
    GuessGamePlayer p3;
    GuessGamePlayer p2;
    public void startGame() {
        lprint("And we're on!");
        p1 = new GuessGamePlayer();
        p2 = new GuessGamePlayer();
        p3 = new GuessGamePlayer();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        lprint("I'm thinking of a number between 0 and 10....");

        int targetNumber = getRandomInt(0,10);

        while (true){
            p1.guess();
            p2.guess();
            p3.guess();

            p1Guess = p1.getNumber();
            p2Guess = p2.getNumber();
            p3Guess = p3.getNumber();

            lprint("Player 1 guessed " + p1Guess);
            lprint("Player 2 guessed " + p2Guess);
            lprint("Player 3 guessed " + p3Guess);

            if (p1Guess == targetNumber) {
                p1IsRight = true;
            }

            if (p2Guess == targetNumber) {
                p2IsRight = true;
            }

            if (p3Guess == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight ){

                lprint("We have a winner!!!");
                lprint("Player 1 got it right? " + p1IsRight);
                lprint("Player 2 got it right? " + p2IsRight);
                lprint("Player 3 got it right? " + p3IsRight);
                lprint("The Game is over.");
                break;
            }
            else {
                lprint("Players witll try again...");
            }
        }



    }
}
