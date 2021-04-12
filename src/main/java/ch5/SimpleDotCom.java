package ch5;

import static helpers.OutputEasy.lprint;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public String checkYourself(String userGuess) {
        int guess = Integer.getInteger(userGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        lprint(result);
        return result;
    }
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

}
