package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilo Calculates the weight in grams of a given weight in kilograms.
 *
 */
public class KiloToGramsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int KILOS_TO_GRAMS = 1000;
        int inputKilos = 0;
        int kilosToGrams = 0;

        System.out.println("Εισάγετε το βάρος σας σε κιλά:");
        inputKilos = scanner.nextInt();
        kilosToGrams = inputKilos * KILOS_TO_GRAMS;

        System.out.printf("Το βάρος σου σε γραμμάρια είναι: %,d%n", kilosToGrams);
    }
}
