package gr.aueb.cf.cf9.ch5;

/**
 * Demo of Declarations.
 */
public class DeclarationsApp {
    public static void main(String[] args) {
        float myFloat = 12.345f;
        double myDouble = 12.3456789;
        final double PI = 3.14;
        final float LIGHT_SPEED = 2.99792458E8f;


        System.out.printf("myFloat = %.3f, myDouble = %f%n", myFloat, myDouble);
        System.out.printf("PI = %.2f, LightSpeed = %.2f%n", PI, LIGHT_SPEED);
    }
}
