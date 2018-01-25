
import java.util.Arrays;

/**
 * Program will keep track employees during a week period
 *
 * @author Trey Lavender
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        int[][] employees = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        int total = 0;
        int[] finish = new int[employees.length];
        int[] finish2 = new int[employees.length];
        System.out.println("            Su   M   T   W  Th   F  Sa   Total");
        for (int i = 0; i < employees.length; i++) {
            total = 0;
            System.out.print("Employee " + i + "   ");
            for (int j = 0; j < employees[i].length; j++) {
                total += employees[i][j];
                System.out.print("" + employees[i][j] + "   ");
            }
            System.out.println("   " + total);
            finish[i] = total;
            finish2[i] = total;
        }
        Arrays.sort(finish2);
        for (int i = finish.length - 1; i > -1; i--) {
            for (int j = 0; j < finish.length; j++) {
                if (finish[j] == finish2[i]) {
                    System.out.println("Employee " + j + " does " + finish2[i] + " hours a week.");
                    finish[j] = -1;
                }
            }
        }
    }
}
