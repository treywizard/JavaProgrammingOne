package Chapter7;

import java.util.Scanner;

/**
 * Program will find the smallest number in a array.
 *
 * @author Trey Lavender
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextDouble();
            //System.out.print(list[i]);
        }
        System.out.println("The minimum number is: " + min(list));
    }

    /**
     * min method will find the minimum
     *
     * @param array holds the array we are searching through
     * @return returns the minimum number
     */
    public static double min(double[] array) {
        double j = array[0];
        for (int i = 1; i < array.length; i++) {
            if (j > array[i]) {
                j = array[i];
            }
        }
        return j;
    }
}
