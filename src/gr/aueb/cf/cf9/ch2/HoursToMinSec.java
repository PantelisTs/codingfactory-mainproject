package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates Hours to Minutes and Seconds for a given number of hours.
 */
public class HoursToMinSec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int givenHours = 0;
        int calcMins = 0;
        int calcSecs = 0;
        final int HOURS_TO_MINS = 60;
        final int HOURS_TO_SECS = 3600;

        System.out.println("Εισάγετε τον χρόνο σε ώρες:");
        givenHours = scanner.nextInt();
        calcMins = givenHours * HOURS_TO_MINS;
        calcSecs = givenHours * HOURS_TO_SECS;

        System.out.printf("Ο χρόνος σε λεπτά είναι: %,d και ο χρόνος σε δευτερόλπτα είναι: %,d%n", calcMins, calcSecs);
    }
}
