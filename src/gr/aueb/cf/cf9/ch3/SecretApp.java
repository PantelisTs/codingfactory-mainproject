package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης προσπαθεί να μαντέψει ένα secret number.
 */
public class SecretApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        // Είσοδος Δεδομένων και αντιστοίχιση σε μεταβλητές
        System.out.println("Please guess the secret number CORRECTLY!");
        num = scanner.nextInt();

        // Επεξεργασία Δεδομένων - If - If else
        if (num == SECRET) {
            System.out.println("You guessed the secret number");


        } else {
            // Εκτύπωση Αποτελεσμάτων
            System.out.println("You did not guess the secret number!");
        }
    }
}
