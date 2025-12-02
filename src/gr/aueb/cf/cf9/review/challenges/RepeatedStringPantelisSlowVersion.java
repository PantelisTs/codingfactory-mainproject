package gr.aueb.cf.cf9.review.challenges;

/**
 * Δοθέντος ενός {@link String} επιστρέφει ένα String
 * που αποτελέι επανάληψη του αρχικού String, n φορές.
 */
public class RepeatedStringPantelisSlowVersion {

    public static void main(String[] args) {
        String output = "";
        String input = "A";
        int times = 10;

        output = repeatedString(input, times);

        System.out.println("Output: " + output);

    }

    public static String repeatedString (String originalString, int times) {
        String timedString = "";
        for (int i = 1; i <= times; i++) {
            timedString = timedString + originalString;

        }
        return timedString;

    }
}
