package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
/**
 * The user inserts the temperature and the status
 * of isRaining variable, and calculates if it's snowing or not.
 * If the raining and the temperature is below 0, it is snowing.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Παρακαλώ πείτε μας εάν βρέχει (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγεται την θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
