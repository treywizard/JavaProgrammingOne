package Chapter5;

import java.util.Scanner;

/**
 * Program will ask for a string and it will then display it backwards.
 *
 * @author Trey Lavender
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        String sub = scan.nextLine();
        int L = sub.length();
        int K = L - 1;
        String result = "";
        while (L != 0) {
            result += sub.substring(K, L);
            L--;
            K--;
        }
        System.out.println("" + result);
    }
}
