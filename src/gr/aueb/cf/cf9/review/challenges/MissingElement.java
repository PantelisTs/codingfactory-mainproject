package gr.aueb.cf.cf9.review.challenges;

/**
 * Έστω πίνακας με στοιχεία απο 1 εώς n+1
 * για παράδειγμα [1, 2, 3, 4]
 * βρείτε το στοιχείο που λέιπει.
 */
public class MissingElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int diff = 0;

        diff = findMissingElement(a);

        System.out.println(diff);

    }

    public static int findMissingElement (int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n * (n +1)) / 2;

        for (int item : arr) {
            actualSum += item;
        }

        return expectedSum - actualSum;
    }
}
