package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει μια θερμοκρασία.
 * Και το πρόγραμμα υπλογίζει αν η θερμοκρασία είναι < 0  τότε
 * μια μεταβλητή γίνεται true, αλλιώς γίνεται false.
 */
public class TemperatureApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        //Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγεται μια θερμοκρασία: ");
        temperature = scanner.nextInt();

        // Επεξεργασία των δεδομένων
        isTempBelowZero = temperature < 0;

        // Εκτύπωση των αποτελεσμάτων
        System.out.printf("Η θερμοκρασία είναι μικρότερη από 0: %b%n", isTempBelowZero);
    }
}
