package Chapter4;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Program will ask for name, hours worked, hourly pay, federal and state tax
 * and will then display payroll
 *
 * @author Trey Lavender
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments for command box
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int hours;
        double rate, federal, state;
        DecimalFormat format = new DecimalFormat("##.00");
        System.out.println("Enter employee's name: ");
        name = scanner.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        hours = scanner.nextInt();
        System.out.println("Enter hourly pay rate: ");
        rate = scanner.nextDouble();
        System.out.println("Enter federal tax witholding rate: ");
        federal = scanner.nextDouble();
        System.out.println("Enter state tax witholding rate: ");
        state = scanner.nextDouble();
        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + format.format(hours * rate));
        System.out.println("Deductions:");
        System.out.println("    Federal Witholding (" + (federal * 100) + "%): $" + format.format(federal * (hours * rate)));
        System.out.println("    State Witholding (" + (state * 100) + "%): $" + format.format(state * (hours * rate)));
        System.out.println("    Total Deduction: $" + format.format((federal * (hours * rate)) + (state * (hours * rate))));
        System.out.println("Net Pay: $" + format.format((hours * rate) - ((federal * (hours * rate)) + (state * (hours * rate)))));
    }
}
