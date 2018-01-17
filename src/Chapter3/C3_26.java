package Chapter3;

import java.util.Scanner;

/**
 * Program will ask for an integer and will then state true or false for the
 * three statements
 *
 * @author Trey Lavender
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        double number = scan.nextDouble();
        int real = (int) (number);
        boolean one = false;
        boolean two = false;
        boolean three = false;
        if (real % 5 == 0 && real % 6 == 0) {
            one = true;
            two = true;
        } else if (real % 5 == 0 || real % 6 == 0) {
            two = true;
            three = true;
        }
        System.out.println("Is " + real + " divisible by 5 and 6? " + one);
        System.out.println("Is " + real + " divisible by 5 or 6? " + two);
        System.out.println("Is " + real + " divisible by 5 or 6, but not both? " + three);
    }
}
