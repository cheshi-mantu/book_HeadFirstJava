package ch4;

import static helpers.OutputEasy.lprint;

public class GoodDog {
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int size;
    private String breed;
    private String name;

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