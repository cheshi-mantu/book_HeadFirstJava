package ch4;

import static helpers.OutputEasy.lprint;

public class Dog {
    public int size;
    public String breed;
    public String name;

    public void bark(int numOfBarks) {
        lprint(name + " says ");
        while (numOfBarks > 0) {
            if (size > 60) {
                lprint("Wuff! Wuff!");
            } else if (size > 14) {
                lprint("Ruff! Ruff!");
            } else {
                lprint("Yip! Yip!");
            }
            numOfBarks = numOfBarks - 1;
        }
    }
}