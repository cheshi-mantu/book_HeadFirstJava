package ch3;

import ch2.Dog;

public class DogsArray {
    public static void main(String[] args) {
        Dog[] myDogs = new Dog[7];

        for (int i=0; i <= 6; i++) {
            myDogs[i] = new Dog();
            myDogs[i].name = "Dog"+i;
            myDogs[i].breed = "Generic dog";
            myDogs[i].bark();
        }
    }
}
