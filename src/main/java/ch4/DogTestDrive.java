package ch4;


public class DogTestDrive {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.name = "Alfredo";
        dogOne.size = 71;
        dogOne.bark();

        Dog dogTwo = new Dog();
        dogTwo.name = "Butcher";
        dogTwo.size = 30;
        dogTwo.bark();

        Dog dogThree = new Dog();
        dogThree.name = "Killer";
        dogThree.size = 7;
        dogThree.bark();


    }

}
