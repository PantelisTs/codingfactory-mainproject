package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τa base και power και το πρόγραμμα
 * υπολογίζει το base ^ power.
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please give me the base number: ");
        base = scanner.nextInt();
        System.out.println("Please give me the power number: ");
        power = scanner.nextInt();

        for (int i = 1 ; i <= power ; i++ ) {
            result = result * base;
        }

        System.out.println("Result: " + result);
    }
}
