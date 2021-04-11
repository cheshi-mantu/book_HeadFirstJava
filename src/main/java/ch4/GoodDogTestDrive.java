package ch4;


public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog dogOne = new GoodDog();
        dogOne.setName("Alfredo");
        dogOne.setSize(71);
        dogOne.bark(1);

        GoodDog dogTwo = new GoodDog();
        dogTwo.setName("Butcher");
        dogTwo.setSize(30);
        dogTwo.bark(2);

        GoodDog dogThree = new GoodDog();
        dogThree.setName("Killer");
        dogThree.setSize(7);
        dogThree.bark(3);


    }

}
