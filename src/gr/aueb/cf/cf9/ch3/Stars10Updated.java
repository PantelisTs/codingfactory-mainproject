package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * prints 10 horizontal stars
 */
public class Stars10Updated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int times = 0;

        System.out.println("Δώσε μας τον αριθμό από τα αστεράκια που θέλεις:");
        times = scanner.nextInt();


        while (i <= times) {
            System.out.print("*");
            i++;
        }

    }
}
