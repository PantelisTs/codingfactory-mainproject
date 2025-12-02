package gr.aueb.cf.cf9.ch6;

/**
 * Βρίσκει το ελάχιστο στοιχείο ενός πίνακα.
 */
public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {110, 22, 31, 40, 50, 61, 70, 18, 28, 143};
        int min = 0;

        min = getMinPosition(arr);
        System.out.println(min);
    }

    public static int getMinPosition (int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
