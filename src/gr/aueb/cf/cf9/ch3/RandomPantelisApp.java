package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τρέχει μέχρι να βρει το κρυφό νούμερο που έδωσε ο χρήστης
 */
public class RandomPantelisApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = 0;
        int num = 0;
        int tries = 0;

        System.out.println("Δωσε μου εναν κρυφό αριθμό");
        givenNumber = scanner.nextInt();

        while (num != givenNumber) {
            num = (int) (Math.random() * 1000000);
            tries++;

        }

        System.out.printf("You find the secret number %d with your %,d try%n", num, tries);



    }
}
