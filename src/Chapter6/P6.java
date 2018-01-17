package Chapter6;

import java.util.Scanner;

/**
 * Program will ask for your total amount of money in US dollars. Then will ask
 * what you want to convert the money to.
 *
 * @author Trey Lavender
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Euros can a dollar buy.");
        double E = scanner.nextDouble();
        System.out.println("How many Pound Sterling can a dollar buy.");
        double P = scanner.nextDouble();
        System.out.println("How many Yen can a dollar buy.");
        double Y = scanner.nextDouble();
        boolean running = true;
        String convert;
        double total = 0.0;
        double amount = 0.0;
        int t = 1;
        while (running == true) {
            t = 1;
            System.out.println("How much are you converting");
            total = scanner.nextDouble();
            System.out.println("Type E to buy Euros, P to buy Pounds, and Y to buy Yen");
            convert = scanner.next();
            if (convert.equalsIgnoreCase("E")) {
                amount = convert(total, E);
                System.out.println("For " + total + " dollars, you will be able to buy " + amount + " Euros.");
            } else if (convert.equalsIgnoreCase("P")) {
                amount = convert(total, P);
                System.out.println("For " + total + " dollars, you will be able to buy " + amount + " Pound Sterlings.");
            } else if (convert.equalsIgnoreCase("Y")) {
                amount = convert(total, Y);
                System.out.println("For " + total + " dollars, you will be able to buy " + amount + " Yen.");
            }
            System.out.println("Are there more conversions to perform?");
            convert = scanner.next();
            while (t != 0) {
                if (convert.equals("no")) {
                    running = false;
                    t = 0;
                } else if (convert.equals("yes")) {
                    t = 0;
                } else {
                    System.out.println("Enter \"yes\" to continue or \"no\" to stop");
                }
            }
        }
    }

    /**
     * Converts total money to what your total would be after tax
     *
     * @param money The amount of US money you have.
     * @param con The conversion amount for the type of money you selected.
     * @return Returns double value which will be new total money.
     */
    public static double convert(double money, double con) {
        double tax;
        if (money > 100) {
            money *= con;
            tax = (money / 100) * 5;
            money -= tax;
        } else if (money <= 100) {
            money *= con;
            tax = (money / 100) * 10;
            money -= tax;
        }
        return money;
    }
}
