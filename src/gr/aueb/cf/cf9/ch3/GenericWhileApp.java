package gr.aueb.cf.cf9.ch3;

/**
 * Δίνουμε αρχική τιμή, τελική τιμή και βήμα αύξησης
 * και υπολογίζει το πλήθος των επαναλήψεων
 */
public class GenericWhileApp {
    public static void main(String[] args) {
        int i = 1;
        int endVal = 10;

        while (i <= endVal) {
            System.out.printf("i = %d%n", i);
            i++;
        }

        System.out.printf("Επαναλήψεις / Loops / Iterations: %d%n", (i - 1));
    }
}
