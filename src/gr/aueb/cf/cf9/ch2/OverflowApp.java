package gr.aueb.cf.cf9.ch2;

/**
 * Προσθέτει δύο ακεραίους και το αποτέλεσμα
 * δημιοθργεί υπερχείλιση (overFlow).
 */

public class OverflowApp {

    // Δήλωση και αρχικοποίηση μεταβητών
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβητών
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.printf("Το αποτέλεσμα είναι: " + result);
    }
}
