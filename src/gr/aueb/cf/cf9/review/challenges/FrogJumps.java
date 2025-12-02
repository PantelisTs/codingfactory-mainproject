package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα σημείο Χ, να πάει σε ένα σημείο Y
 * όπου κάθε απόσταση jump, είναι jump.
 *
 * Έστω ότι
 * χ = 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {

    public static void main(String[] args) {
        int start = 10;
        int end = 55;
        int jump = 25;
        int totalJumps = 0;
        int totalJumps2 = 0;
        int totalJumps3 = 0;

        totalJumps = frogJumps2(start, end, jump);
        totalJumps2 = frogJumps(start, end, jump);
        totalJumps3 = frogJumps3(start, end, jump);

        System.out.println(totalJumps);
        System.out.println(totalJumps2);
        System.out.println(totalJumps3);

    }

    public static int frogJumps (int start, int end, int jump) {
        int jumpCount = 0;

        while (start < end) {
            start += jump;
            jumpCount++;
        }
        return jumpCount;

    }

    public static int frogJumps2 (int start, int end, int jump) {
        int jumpCount = 0;
        int Distance = end - start;

        if (Distance % jump > 0) {
            jumpCount = (Distance / jump) + 1;
        } else {
            jumpCount = Distance / jump;
        }

        return jumpCount;
    }

    public static int frogJumps3(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }

}
