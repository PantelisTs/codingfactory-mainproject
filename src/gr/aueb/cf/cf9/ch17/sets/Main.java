package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        // add - NO duplicates
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Orange");
        bag.add("apple");           // NO DUPLICATES


        // Time-complexity 0(1)
        if (bag.contains("Apple")) {               //Override equals
            bag.remove("Apple");
        } else {
            System.out.println("Apple not included in the bag");
        }


        bag.forEach(System.out::println);

        bag.removeIf(item -> item.startsWith("B"));
        bag.forEach(System.out::println);
    }

}
