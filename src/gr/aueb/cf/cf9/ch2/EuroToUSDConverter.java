package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 *  Λαμβάνει απο τον χρήστη ένα ποσό (ακέραιος) σε ευρώ και το
 *  μετατρέπει σε δολάρια ΗΠΑ με βάση μια ισοτιμία. Για παράδειγμα,
 *  αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία ειναι 1 Euro = 99 USA Cents,
 *  τότε τα συνολικά USA Cents είναι 9985 και αυτλο αντιστοιχεί σε 99 USA Dollars και 0 USA Cents.
 */

public class EuroToUSDConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usd = 0;
        int remainingUsaCents = 0;
        final int EURO_TO_USD_CENTS = 99;

        System.out.println("Εισάγετε τα χρήματα σε ευρώ:");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * EURO_TO_USD_CENTS;
        usd = totalUsaCents / 100;
        remainingUsaCents = totalUsaCents % 100;

        System.out.printf("Τα δολλάρια τελικά είναι: %,d dollars and %02d cents%n", usd, remainingUsaCents );
    }

}
