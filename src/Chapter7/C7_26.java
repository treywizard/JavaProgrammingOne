package Chapter7;

import java.util.Scanner;

/**
 * Program will see if the two list you enter are strictly identical.
 *
 * @author Trey Lavender
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long is list1?");
        int array1[] = new int[scanner.nextInt()];
        System.out.println("Enter list1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("How long is list2?");
        int array2[] = new int[scanner.nextInt()];
        System.out.println("Enter list2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        if (equals(array1, array2) == true) {
            System.out.println("Two list are strictly identical");
        } else {
            System.out.println("Two list are not strictly identical");
        }
    }

    /**
     * equals method compares the two list.
     *
     * @param list1 first list for comparison
     * @param list2 second list for comparison
     * @return returns the result of the comparison
     */
    public static boolean equals(int[] list1, int[] list2) {
        boolean check = true;
        if (list1.length != list2.length) {
            check = false;
            return check;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                check = false;
            }
        }
        return check;
    }
}
