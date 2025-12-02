package gr.aueb.cf.cf9.ch5;


import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Give me a number for the base: ");
        base = scanner.nextInt();
        System.out.println("Give me a number for the power: ");
        power = scanner.nextInt();

        result = powerMethod(base, power);
        System.out.println("The result: " + result);
    }

    public static int powerMethod(int num1, int num2) {
        int resultNum = 1;

        for (int i = 0; i < num2; i++) {
            resultNum *= num1;
        }

        return resultNum;
    }
}
