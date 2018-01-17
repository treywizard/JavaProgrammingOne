package Chapter5;

import java.util.Scanner;

/**
 * Program will ask for a answer and base on the answer your values will change
 * or the code will stop running.
 *
 * @author Trey Lavender
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        String response = "U";
        Scanner scanner = new Scanner(System.in);
        int yVotes = 0, nVotes = 0;
        System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
        while (!response.equalsIgnoreCase("Q")) {
            response = scanner.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                yVotes++;
                System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            } else if (response.equalsIgnoreCase("N")) {
                nVotes++;
                System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            } else if (response.equalsIgnoreCase("Q")) {
                System.out.println("" + yVotes + " Yes votes and " + nVotes + " No votes.");
            } else {
                System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            }
        }
    }

}
