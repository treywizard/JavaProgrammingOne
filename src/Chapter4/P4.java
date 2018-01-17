package Chapter4;

import java.util.Scanner;

/**
 * Program will ask for two different employees information to see which one is
 * hired
 *
 * @author Trey Lavender
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerTwo = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("How many hours of work is needed?");
        int hours = scanner.nextInt();
        System.out.println("How much are you pay an hour?");
        double pay = scanner.nextDouble();
        System.out.println("What is your name?");
        String nameTwo = scannerTwo.next();
        System.out.println("How many hours of work is needed?");
        int hoursTwo = scannerTwo.nextInt();
        System.out.println("How much are you pay an hour?");
        double payTwo = scannerTwo.nextDouble();
        double cost = hours * pay;
        double costTwo = hoursTwo * payTwo;
        if (cost < costTwo) {
            System.out.println("Congratulations " + name + " you have been selected with " + String.format("%.2f", cost) + " cost.");
        } else if (costTwo < cost) {
            System.out.println("Congratulations " + nameTwo + " you have been selected with " + String.format("%.2f", cost) + " cost.");
        } else if (hours < hoursTwo) {
            System.out.println("Congratulations " + name + " you have been selected with " + String.format("%.2f", cost) + " cost and " + hours + " hours.");
        } else if (hours > hoursTwo) {
            System.out.println("Congratulations " + nameTwo + " you have been selected with " + String.format("%.2f", cost) + " cost and " + hoursTwo + " hours.");
        } else if (cost == costTwo && hours == hoursTwo) {
            System.out.println("" + name + " and " + nameTwo + ", you both have identical bids and both want " + String.format("%.2f", cost) + " cost and " + hoursTwo + " hours snd " + String.format("%.2f", payTwo));
        }
    }
}
