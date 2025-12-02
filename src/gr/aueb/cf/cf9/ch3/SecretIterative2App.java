package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SecretIterative2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_NUMBER = 21;
        int num = 0;

        System.out.println("Give me a number!");
        num = scanner.nextInt();

        while (num != SECRET_NUMBER) {
            System.out.println("Try Again! Insert new number: ");
            num = scanner.nextInt();
        }

        System.out.printf("You guessed it right! The secret number is: %d%n", num);
    }
}
