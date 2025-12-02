package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός ακεραίου με την χρήση
 * του τριαδικού τελεστή. Το απόλυτο ενός ακεραίου είναι
 * πάντα θετικός αριθμός. Για παράδειγμα το απόλυτο του -5 είναι 5
 * και το απόλυτο του 5 ειναι επίσης 5.
 */
public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        //Input - Είσοδος δεομένων
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();   //Data binding


        //Επεξεργασία δεδομένων
//        if (num >=0) {
//            abs = num;
//        } else {
//            abs = - num;
//        }

        abs = (num >= 0) ? num : - num;    //if num >=0 -> num else is - num

        System.out.println("The absolute of your number is: " + abs);

    }
}
