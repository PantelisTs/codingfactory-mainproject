package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης
 */


public class CalculatorApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 6;
        int result = 0;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Η επιλογή πρέπει να είναι μεταξύ 1-6");
                continue;
            }

            if (choice == EXIT) {
                System.out.println("EΞΟΔΟΣ");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);

        }
    }

    public static void printMenu() {
        System.out.println("ΜΕΝΟΥ");
        System.out.println("1. ΠΡΟΣΘΕΣΗ");
        System.out.println("2. ΑΦΑΙΡΕΣΗ");
        System.out.println("3. ΔΙΑΙΡΕΣΗ");
        System.out.println("4. ΠΟΛΛΑΠΛΑΣΙΑΣΜΟΣ");
        System.out.println("5. ΥΠΟΛΟΙΠΟ ΔΙΑΙΡΕΣΗΣ");
        System.out.println("6. ΕΞΟΔΟΣ");
    }


    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice (int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = getOneInt();
        num2 = getOneInt();

//        switch (choice) {
//            case 1:
//                add(num1, num2);
//                break;
//            case 2:
//                sub(num1, num2);
//                break;
//            case 3:
//                mul(num1, num2);
//                break;
//            case 4:
//                div(num1, num2);
//            case 5:
//                mod(num1, num2);
//                break;
//            default:
//                System.out.println("Λάθος επιλογή!");
//                break;
//        }
//        return result;

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> div(num1, num2);
            case 4 -> mul(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 % num2;
    }
}
