package gr.aueb.cf.cf9.ch17.maps;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // Add
        countries.put("GR", "Germany");
        countries.put("USA", "United States");
        countries.put("IT", "Italy");
        countries.put("GR", "Greece");

        // Get
        String country = countries.get("GR");
        System.out.println(country);

        // Remove
        countries.remove("USA");

        // Traverse
        countries.forEach((key, value) -> System.out.println(key + " - " + value));

        var filteredCities = countries.entrySet().stream()
                .filter(entry -> entry.getKey().length() <= 2)
                .collect(Collectors.toSet());

        filteredCities.forEach(System.out::println);
    }
}
