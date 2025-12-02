package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής demo.
 * Υπολογίζει τον μικρότερο μεταξύ δύο ακεραίων που δίνει ο χρήστης.
 */
public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Give me the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Give me the second number: ");
        num2 = scanner.nextInt();

//        if (num1 < num2) {
//            min = num1;
//            System.out.printf("The min number is:", min);
//       }
//
//        if (num1 > num2) {
//            min = num2;
//            System.out.printf("The min number is:", min);
//        }


        min = (num1 < num2) ? num1 : num2;
        System.out.printf("The min number is: %d%n", min);
    }
}
