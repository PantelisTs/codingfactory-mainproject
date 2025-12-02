package gr.aueb.cf.cf9.ch4;

public class StarsHorizontalApp {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("*");
//        }

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
