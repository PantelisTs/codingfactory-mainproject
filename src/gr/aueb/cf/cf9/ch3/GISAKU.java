package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class GISAKU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilos = 0;
        int grammars = 0;
        final int KILO_TO_GRAMMAR = 1000;

        System.out.println("dose ta kila sou");
        kilos = scanner.nextInt();

        grammars = kilos * KILO_TO_GRAMMAR;

        System.out.printf("ta kila sou se grammaria einai: %,d%n", grammars);




    }
}
