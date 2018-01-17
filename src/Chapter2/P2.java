package Chapter2;

import java.util.Scanner;

/**
 * Program will ask for prices and will show cost, tax, tip, and total cost
 *
 * @author Trey Lavender
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner for meal price
        System.out.println("What will be the price of your food?");
        Double food = scan.nextDouble();
        System.out.println("What is the price of your drink?");
        Double drink = scan.nextDouble();
        System.out.println("And what is the price of your dessert?");
        Double dessert = scan.nextDouble();
        Double mealcost = food + drink + dessert;
        System.out.println("The cost of food is: " + mealcost);
        Double tax = mealcost * 0.1;
        System.out.println("The tax would be: " + tax);
        Double tip = (mealcost + tax) * 0.15;
        System.out.println("The tip would cost you: " + tip);
        Double total = mealcost + tax + tip;
        System.out.println("The total cost would be " + total + "$");
    }

}
