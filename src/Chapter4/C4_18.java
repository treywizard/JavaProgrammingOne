package Chapter4;

import java.util.Scanner;

/**
 * Program will ask for two characters and will then figure out what Major and
 * grade you are base off it
 *
 * @author Trey Lavender
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String placeholder = scanner.nextLine();
        String first = placeholder.substring(0, 1);
        char second = placeholder.charAt(1);
        boolean invalid = true;
        if (second != 1 && second != 2 && second != 3 && second != 4) {
            invalid = false;
        }
        if ((first.equals("m") || first.equals("M")) && invalid == false) {
            System.out.println("Mathmatics ");
        } else if ((first.equals("c") || first.equals("C")) && invalid == false) {
            System.out.println("Computer Science ");
        } else if ((first.equals("i") || first.equals("I")) && invalid == false) {
            System.out.println("Information Technology ");
        } else {
            invalid = false;
        }
        if (second == '1' && invalid == false) {
            System.out.print("Freshman");
        } else if (second == '2' && invalid == false) {
            System.out.print("Sophomore");
        } else if (second == '3' && invalid == false) {
            System.out.print("Junior");
        } else if (second == '4' && invalid == false) {
            System.out.print("Senior");
        } else {
            System.out.println("Invaild input");
        }
        System.out.println();
    }
}
