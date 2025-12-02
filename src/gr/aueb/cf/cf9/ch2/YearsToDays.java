package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 * θεωρούμε ότι το 1 έτος = 365 ημέρες. Για παράδειγμα, αν δοθεί
 * ηλικία 20 ετών, το αποτέλεσμα είναι 7300 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Ποια είναι η ηλικία σου σε χρόνια;");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Η ηλικία σου σε ημέρες είναι: %,d%n", ageInDays);
    }
}
