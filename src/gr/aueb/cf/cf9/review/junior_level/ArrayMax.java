package gr.aueb.cf.cf9.review.junior_level;

public class ArrayMax {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 50, 6, 7, 8, 9, 10};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
