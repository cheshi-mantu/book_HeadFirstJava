package ch1;

public class LoopsWhile {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        System.out.println("x = " + x);
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("The value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after loop");
        System.out.println("x = " + x);
    }
}
