package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός
 * ακεραίου. Για παράδειγμα, αν ο ακέραιος είναι
 * ο 178, το πλήθος των ψηφίων ειναι 3.
 */
public class DigitsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int digits = 0;

        System.out.println("Please enter a number");
        num = scanner.nextInt();

        while (num > 0) {
            num /= 10;
            digits++;
        }
        System.out.println("Number of digits:" + digits);
    }
}
