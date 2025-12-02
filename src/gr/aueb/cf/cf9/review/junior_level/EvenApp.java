package gr.aueb.cf.cf9.review.junior_level;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Άρτιος");
        } else {
            System.out.println("Περριτός");
        }
    }
}
