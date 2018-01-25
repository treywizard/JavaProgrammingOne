
import java.util.Scanner;

/**
 * Program will Assign a grade base on student scores
 *
 * @author Trey Lavender
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[4];
        System.out.println("Enter the number of students: ");
        int length = scanner.nextInt();
        System.out.println("Enter " + length + " scores: ");
        for (int i = 0; i < length; i++) {
            scores[i] = scanner.nextInt();
        }
        int best = scores[0];
        for (int i = 1; i < length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (scores[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
            } else if (scores[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
            } else if (scores[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
            }
        }
    }
}
