package Chapter4;

import java.util.Scanner;

/**
 * Program will ask for two string and see if one of them is a substring of the
 * other
 *
 * @author Trey Lavender
 */

public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter String s2: ");
        String s2 = scanner.nextLine();
        boolean truth = false;
        if (s1.length() < s2.length()) {

        } else {
            int length1 = s1.length() - 1;
            int length2 = s2.length() - 1;
            if (s1.equals(s2)) {
                truth = true;
            }
            int start = 0;
            while (length2 <= length1) {
                if (s1.substring(start, length2).equals(s2)) {
                    truth = true;
                } else {
                    start++;
                    length2++;
                }
            }
        }
        if (truth == true) {
            System.out.println("" + s2 + " is a substring of" + s1);
        } else {
            System.out.println("" + s2 + " is not substring of " + s1);
        }
    }
}
