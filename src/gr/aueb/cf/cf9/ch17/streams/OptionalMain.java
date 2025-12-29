package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;

public class OptionalMain {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 10),
                new Product("Oranges", 11.5, 7),
                new Product("Milk", 10.5, 3),
                new Product("Cheese", 13.5, 1)
        ));

        // We need to find a product with price >= 20

        Product product = products.stream()
                .filter(p -> p.getPrice() >= 20)
                .findFirst()
//                .orElse(new Product("No product found", 0, 0));
                .orElseThrow(() -> new Exception("No product found"));

    }
}
