package Chapter3;

import java.util.Scanner;

/**
 * Program will ask for two weight and prices of separate packages
 *
 * @author Trey Lavender
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight and price of package 1. ");
        double weightOne = scan.nextDouble();
        double priceOne = scan.nextDouble();
        System.out.println("Enter weight and price of package 2. ");
        double weightTwo = scan.nextDouble();
        double priceTwo = scan.nextDouble();
        if (priceOne / weightOne > priceTwo / weightTwo) {
            System.out.println("Package 2 has a better price.");
        } else if (priceOne / weightOne == priceTwo / weightTwo) {
            System.out.println("Both packages are the same price.");
        } else {
            System.out.println("Package 1 has a better price.");
        }
    }
}
