package ch2;

import static helpers.OutputEasy.lprint;

public class Dog {
    int size;
    public String breed;
    public String name;
    public void bark(){
        lprint(name + " Says Ruff! Ruff!");
    }
}
