package gr.aueb.cf.cf9.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 10),
                new Product("Oranges", 11.5, 7),
                new Product("Milk", 10.5, 3),
                new Product("Cheese", 13.5, 1)
        ));

        products.sort(Comparator.naturalOrder());   // Ascending order
        products.forEach(System.out::println);
        products.sort(Comparator.reverseOrder());   // Descending order
        products.sort(Comparator.comparing(Product::getPrice));
//        products.sort((a, b) -> b.getQuantity() - a.getQuantity()); // Ascending order

        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice , Comparator.reverseOrder())   //price descending
                .thenComparing(Product::getDescription));
    }
}

