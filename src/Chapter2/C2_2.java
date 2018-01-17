package Chapter2;

import java.util.Scanner;

/**
 * Program will ask for radius and length and will then display area and volume
 *
 * @author Trey Lavender
 */

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, length;
        System.out.println("Enter the radius and length of the cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
