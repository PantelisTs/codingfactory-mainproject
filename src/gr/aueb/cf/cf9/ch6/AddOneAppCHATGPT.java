package gr.aueb.cf.cf9.ch6;

/**
 * Έστω ότι αναπαριστούμε μεγάλους ακεραίους
 * σε μορφή πίνακα. Θέλουμε να προσθέσουμε την μονάδα.
 */
public class AddOneAppCHATGPT {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = addOne(digits);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num);
        }
        System.out.println(); // for newline
    }

    public static int[] addOne(int[] arr) {
        int n = arr.length;

        // Start from the last digit and add one
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr; // No carry needed
            }
            arr[i] = 0; // Carry over
        }

        // If all digits were 9 (like 9999 → 10000)
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
