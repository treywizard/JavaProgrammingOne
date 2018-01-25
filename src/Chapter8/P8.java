
import java.util.Scanner;

/**
 * Program will keep track of multiple workers sales and track them in a
 * calendar
 *
 * @author Trey Lavender
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worker[][] = new double[4][5];
        int i = 0;
        String t = "e";
        String r = "t";
        int j = -1;
        int k = -1;
        double l = 0.0;
        while (i == 0) {
            System.out.println("Enter the salesman ID as A, B, C, or D.");
            while (j == -1) {
                t = scanner.nextLine();
                if (t.equalsIgnoreCase("A")) {
                    j = 0;
                } else if (t.equalsIgnoreCase("B")) {
                    j = 1;
                } else if (t.equalsIgnoreCase("C")) {
                    j = 2;
                } else if (t.equalsIgnoreCase("D")) {
                    j = 3;
                } else {
                    j = -1;
                    System.out.println("Can you please replace the current response with valid one?");
                }
            }
            System.out.println("Enter the day as M, T, W, H, or F.");
            while (k == -1) {
                r = scanner.nextLine();
                if (r.equalsIgnoreCase("M")) {
                    k = 0;
                } else if (r.equalsIgnoreCase("T")) {
                    k = 1;
                } else if (r.equalsIgnoreCase("W")) {
                    k = 2;
                } else if (r.equalsIgnoreCase("H")) {
                    k = 3;
                } else if (r.equalsIgnoreCase("F")) {
                    k = 4;
                } else {
                    k = -1;
                    System.out.println("Can you please replace the current response with valid one?");
                }
            }
            System.out.println("Enter the amount of the sale for " + t + " on " + r + ": ");
            l = scanner.nextDouble();
            worker[j][k] = l;
            System.out.println("More data? Enter Y for more or N to stop.");
            t = "";
            k = -1;
            r = "";
            j = -1;
            l = 0;
            while (i == 0) {
                t = scanner.nextLine();
                if (t.equalsIgnoreCase("Y")) {
                    break;
                } else if (t.equalsIgnoreCase("N")) {
                    i = -1;
                }
            }
        }
        table(worker);
    }

    /**
     * table method sets up the calendar
     *
     * @param TO holds workers records.
     */
    public static void table(double[][] TO) {
        System.out.println("   M     T     W     H     F");
        System.out.print("A  ");
        for (int i = 0; i < 5; i++) {
            System.out.print(TO[0][i] + "  ");
        }
        System.out.println();
        System.out.print("B  ");
        for (int i = 0; i < 5; i++) {
            System.out.print(TO[1][i] + "  ");
        }
        System.out.println();
        System.out.print("C  ");
        for (int i = 0; i < 5; i++) {
            System.out.print(TO[2][i] + "  ");
        }
        System.out.println();
        System.out.print("D  ");
        for (int i = 0; i < 5; i++) {
            System.out.print(TO[3][i] + "  ");
        }
    }
}
