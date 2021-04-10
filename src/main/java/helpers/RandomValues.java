package helpers;

import java.util.Random;

public class RandomValues {
    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be larger than Min!");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
