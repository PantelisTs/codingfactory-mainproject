package gr.aueb.cf.cf9.ch6;

public class ArrayCircularRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 15, 2, 4, 4, 2, 15, 1};
        int[] arrrot;
        arrrot = shiftLeftBy(arr, 1);
        printArray(arrrot);


    }

    public static int[] shiftRightBy (int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[((i + offset) % arr.length)] = arr[i];
        }

        return rotated;
    }

    public static int[] shiftLeftBy (int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");

        }
    }
 }
