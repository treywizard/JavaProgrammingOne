package Chapter2;

import java.util.Scanner;

/**
 * Program will ask for Celsius and will convert the number into Fahrenheit
 *
 * @author Trey Lavender
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a deegree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("" + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
