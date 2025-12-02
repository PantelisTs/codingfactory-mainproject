package gr.aueb.cf.cf9.ch8;

/**
 * Null Pointer Exception Demo.
 */
public class NPEApp {
    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        if (s == null) {
            System.out.println("s is Null");
            return;

        }
        System.out.println(s.length());
    }

    public static String getOneOrNull() {
        return null;
    }
}
