package gr.aueb.cf.cf9.ch15.marker;

import gr.aueb.cf.cf9.ch11.Product;

public class Main {
    public static void main(String[] args) {
        Item cd = new CompactDisk(2, "TheWeeknd - In Your Eyes");
        Item book = new Book(1, "A");
        Product product = new Product();

        deliver(book);
        deliver(cd);
        // deliver(product);     // Compile-time safety

    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Delivering Book...");
        } else if (item instanceof CompactDisk) {
            System.out.println("Delivering CD...");
        } else {
            throw new AssertionError("Unknown item type!");
        }
    }
}
