package Chapter5;

import java.util.Scanner;

/**
 * Program will user for a choice in 1, 2, or 3. In order to determine the
 * winner of a rock, paper, scissor game. The program will go on until somebody
 * has more than 2 wins.
 *
 * @author Trey Lavender
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = (int) (Math.random() * 3);
        int CWins = 0;
        int UWins = 0;
        int user;
        String C = "X";
        String U = "Y";
        while (CWins < 2 && UWins < 2) {
            System.out.println("Scissors(0), Rock(1), Paper(2): ");
            user = scanner.nextInt();
            if (result == 0) {
                C = "Scissors";
            } else if (result == 1) {
                C = "Rock";
            } else if (result == 2) {
                C = "Paper";
            }
            if (user == 0) {
                U = "Scissors";
            } else if (user == 1) {
                U = "Rock";
            } else if (user == 2) {
                U = "Paper";
            }
            if (user == 2 && result == 0) {
                System.out.println("The computer is " + C + ". You are " + U + ". Computer wins");
                CWins++;
            } else if (result == 2 && user == 0) {
                System.out.println("The computer is " + C + ". You are " + U + ". User wins");
                UWins++;
            } else if (result > user) {
                System.out.println("The computer is " + C + ". You are " + U + ". Computer wins");
                CWins++;
            } else if (user > result) {
                System.out.println("The computer is " + C + ". You are " + U + ". User wins");
                UWins++;
            } else if (user == result) {
                System.out.println("Computer is " + C + ". You are " + U + ". It is a draw");
            }
            result = (int) (Math.random() * 3);
        }

    }
}
