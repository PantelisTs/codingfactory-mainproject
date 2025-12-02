package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positive numbers in an array.
 * How many loops will be needed is a decision that
 * happens @runtime.
 */
public class PositiveCounts {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        // Εισαγωγή δεδομένων
        System.out.println("Please enter a number:");
        num = scanner.nextInt();

        // Επεξεργασία δεδομένων
        while (num >= 0) {
            positives++;
            System.out.println("Please enter a number:");
            num = scanner.nextInt();

        }
        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Positives in a row: %d%n", positives);
    }
}
