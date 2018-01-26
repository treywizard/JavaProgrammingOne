package Chapter7;

import java.util.Scanner;

/**
 * Program will ask you for amount of number and will then find the average of
 * those random numbers
 *
 * @author Trey Lavender
 */
class P7 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will it read?");
        double[] check = new double[scanner.nextInt()];
        repeat(check);
        System.out.println("The average is..." + average(check));
    }

    /**
     * Repeat method that fills a array spot with a random number.
     *
     * @param line the array that will be filled with random numbers
     */
    public static void repeat(double[] line) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < line.length; i++) {
            line[i] = (Math.random() * 10);
        }
    }

    /**
     * Average method finds the average of the array.
     *
     * @param rai the array we will be finding the average of.
     * @return Returns the average.
     */
    public static double average(double[] rai) {
        double average = 0;
        for (int i = 0; i < rai.length; i++) {
            average += rai[i];
        }
        average = average / rai.length;
        return average;
    }

    /**
     * Print method will print the numbers in the array.
     *
     * @param u The array that we will be printing out the numbers from.
     */
    public static void print(double[] u) {
        for (int i = 0; i < u.length; i++) {
            System.out.print(u[i] + " ");
        }
    }
}
