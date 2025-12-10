package gr.aueb.cf.cf9.ch15.skeletal_impl;

public class Main {
    public static void main(String[] args) {

        // 1. Create a Square using our new constructor
        // We treat it as an IRectangle (Polymorphism)
        IRectangle square = new Square(5.0, 5.0);

        // 2. Call the methods defined in the interface
        System.out.println("--- Square Details ---");
        System.out.println("Area: " + square.getArea());          // 5 * 5 = 25.0
        System.out.println("Perimeter: " + square.getPerimeter()); // 4 * 5 = 20.0
        System.out.println("Is it a square? " + square.isSquare()); // Should be true

    }
}