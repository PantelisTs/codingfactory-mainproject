package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class FinallyApp {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int num = 0;

//        try {
//            num = scanner.nextInt();
//            System.out.println("num = " + num);
//        } catch (InputMismatchException e) {
//            System.err.println("Error: " + e.getMessage());
//        } finally {
//            try {
//                if (scanner != null) {
//                    scanner.close();
//                }
//            } catch (Exception e){
//                System.err.println("Error: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }

        //2nd try
        try (Scanner scanner = new Scanner(System.in)) {       //try with resources
            num = scanner.nextInt();
            System.out.println("num = " + num);
        } catch (InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }


        //file error: FileNotFoundException
//        try (Scanner scanner = new Scanner(new File("C:/users/pantel/data.txt"))) {       //try with resources
//            num = scanner.nextInt();
//            System.out.println("num = " + num);
//        } catch (InputMismatchException | FileNotFoundException e) {
//            System.err.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }

    }


}
