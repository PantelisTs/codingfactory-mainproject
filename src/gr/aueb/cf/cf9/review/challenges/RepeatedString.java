package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number:");
            scanner.nextLine();
        }

        num = scanner.nextInt();

        String result = repeatString(input, num);
        System.out.println(result);
    }

    public static String repeatString(String str, int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}