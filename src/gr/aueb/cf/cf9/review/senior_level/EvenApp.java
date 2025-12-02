package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 *  This program calculates if a number is even or not.
 *  @author PantelisTs
 */
public class EvenApp {
    public static void main(String[] args) {

        // Δήλωση και αρχιοποίηση μεταβλητών.
        Scanner scanner = new Scanner(System.in);
        int num = 9;
        boolean result = false;

        // Είσοδος δεδομένων, validation και data binding.
        System.out.println("Please enter a number");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }

        num = scanner.nextInt();

        // Υπηρεσιακή λογική - Παραστάσεις
        result = isEven(num);

        // Εκτύπωση αποτελέσματος
        System.out.println("Is even?");
        System.out.println("Result " + result);

    }

    /**
     * Checks if a number is even.
     * @param num The number to Check.
     * @return True if the number is even, false otherwise.
     */
    public static boolean isEven (int num) {
        return num % 2 == 0;
    }
}
