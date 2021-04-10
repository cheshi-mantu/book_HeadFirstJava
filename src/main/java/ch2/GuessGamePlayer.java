package ch2;

import static helpers.OutputEasy.lprint;
import static helpers.RandomValues.getRandomInt;

public class GuessGamePlayer {
    private int number = 0;
    public void guess(){
        number = getRandomInt(0,10);
        lprint("My guess is " + number);
    }
    public int getNumber(){
        return number;
    }
}
