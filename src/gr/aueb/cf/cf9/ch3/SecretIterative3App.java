package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SecretIterative3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        while (true) {
            System.out.println("Please guess the secret number");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Wrong Try Again!");
                continue;
            }
            System.out.println("You found the number!");
            break;

        }
    }
}
