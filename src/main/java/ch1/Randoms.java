package ch1;

import static helpers.OutputEasy.lprint;
import static helpers.RandomValues.getRandomInt;

public class Randoms {
    public static void main(String[] args) {
        lprint(""+ getRandomInt(10, 20));
    }
}
