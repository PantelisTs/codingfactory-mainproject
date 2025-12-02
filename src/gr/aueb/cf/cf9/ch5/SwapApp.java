package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Ορίζουμε μία μέθοδο void swap(int a, int b) η οποία
 * θα ανταλλάσει αμοιβαίατις τιμές a, b
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d%n", a, b);

        swap(a, b);

        System.out.printf("New a = %d, New b = %d%n", a, b);

    }

    /**
     * Swap two numbers
     * @param a the first number
     * @param b the second number
     */
    public static void swap(int a, int b) {
        int tempNum = a;
        a = b;
        b = tempNum;

    }
}
