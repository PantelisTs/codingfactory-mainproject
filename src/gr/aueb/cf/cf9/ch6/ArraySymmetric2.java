package gr.aueb.cf.cf9.ch6;

/**
 * ελέγχει εάν ένας πίνακας ακεραίων
 * είναι συμμετρικός ή όχι. Συμμετρικός είναι ένας
 * πίνακας αν διαβάζεται το ίδιο από την αρχή και το τέλος.
 * Για παράδειγμα: ....[1, 2, 3, 3, 2, 1]
 * [1, 2, 3, 2, 1]
 */
public class ArraySymmetric2 {
    public static void main(String[] args) {
        int[] arr = { 1, 15, 2, 4, 4, 2, 15, 1};
        CheckSymmetricArray(arr);
    }

    public static void CheckSymmetricArray (int[] arr) {
        for (int i = 0; i < (arr.length/2); i++) {
            if (arr[i] != arr[(arr.length - i - 1)]) {
                System.out.println("Failed");
                break;
            }
            System.out.println("Symmetric Array");
        }
    }
}
