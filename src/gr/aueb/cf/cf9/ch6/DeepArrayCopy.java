package gr.aueb.cf.cf9.ch6;

/**
 * Defensive Array Copy. Deep Copy. Fresh Copy.
 */
public class DeepArrayCopy {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] arrCopy;

        arrCopy = getArrayCopy(arr);

        arrCopy[0] = 1000;
        System.out.println(arr[0]);


    }

    public static int[] getArrayCopy(int[] arr) {
        int[] destinationArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            destinationArr[i] = arr[i];
        }

        return destinationArr;
    }

}
