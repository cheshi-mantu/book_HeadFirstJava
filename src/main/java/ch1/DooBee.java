package ch1;

public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        System.out.println("x = " + x);
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3)
        System.out.print("Do");
    }
}
