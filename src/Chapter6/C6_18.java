package Chapter6;

import java.util.Scanner;

/**
 * Program will tell you if your password is valid or invalid base on user
 * input.
 *
 * @author Trey Lavender
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        int digits = 0;
        System.out.println("Enter a new password");
        String password = scanner.nextLine();
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLetterOrDigit(password.charAt(i))) {
                    if (Character.isDigit(password.charAt(i))) {
                        digits++;
                    }
                } else {
                    work = false;
                }
            }
            if (digits < 2) {
                work = false;
            }
        } else {
            work = false;
        }
        if (work == true) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
