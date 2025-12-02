package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMAXPantelisTsVersion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 50, 6, 7, 8, 9, 10};
        int max = a[0];

        System.out.println("The max number is: " + giveMax(a));


    }

    public static int giveMax (int[] arr) {

        if (arr == null) return - 1;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
