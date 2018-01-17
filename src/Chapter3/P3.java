package Chapter3;

import java.util.Scanner;

/**
 * Program will ask for two numbers and will run them through a couple of test
 *
 * @author Trey Lavender
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first and second number?");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a < b) {
            System.out.println("The first number is less than the second");
        } else if (a > b) {
            System.out.println("The first number is greater than the second");
        } else if (a == b) {
            System.out.println("The first number is equal to the second");
        }
        if (a <= b) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (a != b) {
            System.out.println(" The first number is not equal to the second");
        }
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (a / b < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("improper fraction");
        }
        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (1 <= b && b <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
