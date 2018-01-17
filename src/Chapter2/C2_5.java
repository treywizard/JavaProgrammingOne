package Chapter2;

import java.util.Scanner;

/**
 * Program will ask for subtotal and gratuity rate and will then display both in
 * proper form
 *
 * @author Trey Lavender
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        System.out.println("The gratuity is " + (gratuity / 10) + " and the total is " + (subtotal + (gratuity / subtotal)) + "");
    }
}
