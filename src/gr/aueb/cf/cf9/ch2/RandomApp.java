package gr.aueb.cf.cf9.ch2;

/**
 *
 */

public class RandomApp {

    public static void main(String[] args) {

        int dice = 0;


        dice = (int) (Math.random() * 6) + 1;


        System.out.println("Dice: " + dice);
    }

}
