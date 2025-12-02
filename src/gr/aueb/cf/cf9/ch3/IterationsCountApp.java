package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the use inserts -1.
 * the while - do loop will stop
 */
public class IterationsCountApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        // Εισαγωγή δεδομένων
        System.out.println("Please enter a number:");
        num = scanner.nextInt();

        // Επεξεργασία δεδομένων
        while (num != -1) {
            iterations++;
            System.out.println("Please enter a number:");
            num = scanner.nextInt();
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("The count of iterations is: %d%n", iterations);
    }
}
