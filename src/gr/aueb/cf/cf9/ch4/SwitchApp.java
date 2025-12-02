package gr.aueb.cf.cf9.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Εμφανίζουμε μενού στον χρήστη.
 * Ο χρήστης δίνει το choice.
 * Ανάλογα με το choice δίνουμε
 * το κατάλληλο feedback στον χρήστη
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα ακόλουθα");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. EXIT");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start One-Player Game");
                    break;
                case 2:
                    System.out.println("Start Two-Player Game");
                    break;
                case 3:
                    System.out.println("Start Team Game");
                    break;
                case 4:
                    System.out.println("Exit Game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != EXIT);

        System.out.println("Goodbye!");
    }
}
