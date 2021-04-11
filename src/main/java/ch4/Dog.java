package ch4;

import static helpers.OutputEasy.lprint;

public class Dog {
    public int size;
    public String breed;
    public String name;

    public void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                lprint(name + " says Wuff! Wuff!");
            } else if (size > 14) {
                lprint(name + " says Ruff! Ruff!");
            } else {
                lprint(name + " says Yip! Yip!");
            }
            numOfBarks = numOfBarks - 1;
        }
    }
}