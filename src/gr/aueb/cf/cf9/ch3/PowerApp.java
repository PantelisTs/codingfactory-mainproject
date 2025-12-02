package gr.aueb.cf.cf9.ch3;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Calculates a power of a number, for example. a^n (base^ power).
 * a^n = a * a * a * a * (a, n times).
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Είσοδος Δεδομένων και αντιστοίχιση σε μεταβλητές
        System.out.println("Παρακαλώ εισάγετε το Base και το Power:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Επεξεργασία Δεδομένων - While - Do
        while (i <= power) {
            result *= base;     // result = result * base
            i++;                // i = i + 1
        }

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("%d ^ %d = %d%n", base, power, result);



    }
}
