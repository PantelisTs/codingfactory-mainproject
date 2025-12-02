package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης
 */
public class Calculator2App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int a = 0;
        int b = 0;
        int result = 0;


        while (true){
            menu();
            choice = getOneInt();

            if (choice == 1) {
                System.out.println("Δώσε δύο αριθμούς: ");
                a = scanner.nextInt();
                b = scanner.nextInt();

                result = add(a, b);
            } else if (choice == 2) {
                System.out.println("Δώσε δύο αριθμούς: ");
                a = scanner.nextInt();
                b = scanner.nextInt();

                result = minus(a, b);
            } else if (choice == 3) {
                System.out.println("Δώσε δύο αριθμούς: ");
                a = scanner.nextInt();
                b = scanner.nextInt();

                result = divide(a, b);
            } else if (choice == 4) {
                System.out.println("Δώσε δύο αριθμούς: ");
                a = scanner.nextInt();
                b = scanner.nextInt();

                result = multiply(a, b);
            } else if (choice == 5) {
                System.out.println("Δώσε δύο αριθμούς: ");
                a = scanner.nextInt();
                b = scanner.nextInt();

                result = mod(a, b);
            } else if (choice == 6) {
                break;
            }
            System.out.println("Result: " + result );
            break;

        }

    }


    public static void menu() {
        System.out.println("ΜΕΝΟΥ");
        System.out.println("1. ΠΡΟΣΘΕΣΗ");
        System.out.println("2. ΑΦΑΙΡΕΣΗ");
        System.out.println("3. ΔΙΑΙΡΕΣΗ");
        System.out.println("4. ΠΟΛΛΑΠΛΑΣΙΑΣΜΟΣ");
        System.out.println("5. ΥΠΟΛΟΙΠΟ ΔΙΑΙΡΕΣΗΣ");
        System.out.println("6. ΕΞΟΔΟΣ");
    }



    public static int getOneInt () {
        return scanner.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
