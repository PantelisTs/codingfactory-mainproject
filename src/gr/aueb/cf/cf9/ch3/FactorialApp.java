package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
/**
 * Calculates factorial of a number
 * n! = 1 * 2 * 3 * 4 *....* n
 * For instance, 5! = 1 * 2 * 3 * 4 * 5
 */
public class FactorialApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int giveTimes = 0;
        int result = 1;
        int i = 1;

        // Είσοδος δεδομένων
        System.out.println("Δώστε μια τιμή n:");
        giveTimes = scanner.nextInt();

        // Επεξεργασία
        while (i <= giveTimes) {
            result *= i;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%,d! = %,d%n",giveTimes, result);
    }
}
