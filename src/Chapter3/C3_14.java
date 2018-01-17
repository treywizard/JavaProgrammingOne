package Chapter3;

import java.util.Scanner;

/**
 * Program will ask for what the user think the coin will land on and will then
 * tell the user the result
 *
 * @author Trey Lavender
 */

public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you think the coin will be, head or tail?");
        String guess = scanner.nextLine();
        int result = (int) (Math.random() * 2);
        if (result == 0 && guess.equals("head")) {
            System.out.println("You got it right, it was head");
        } else if (result == 1 && guess.equals("tail")) {
            System.out.println("You got it right, it was tail");
        } else {
            System.out.println("Sorry, you got it wrong");
        }
    }
}
