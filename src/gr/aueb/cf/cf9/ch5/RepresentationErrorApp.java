package gr.aueb.cf.cf9.ch5;

/**
 * Demo of representation error.
 */
public class RepresentationErrorApp {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual = actual + 0.1; //actual += 0.1;
        }

        System.out.println("actual= " + actual);
        System.out.println("expected= " + expected);

        if (actual == expected) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed :(");   // Δεν συγκρίνουμε έτσι τους double εχει σφάλμα απεικόνισης
        }
    }
}
