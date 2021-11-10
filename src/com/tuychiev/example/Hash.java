package com.tuychiev.example;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class Hash {
    public static void main(String[] args) {
        hashMap();
        System.out.println("=========================================");
        hashSet();
    }

    private static void hashSet() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.printf("Create a HashSet and add items to it: %s\n", cars);

        System.out.printf("Check if an it exists in a HashSet: %s\n", cars.contains("Mazda"));

        cars.remove("Volvo");
        System.out.printf("Remove an item from a HashSet: %s\n", cars);

        System.out.printf("Get the size of a HashSet: %s\n", cars.size());

        System.out.printf("Separate a HashSet by comma: %s\n", String.join(", ", cars));

        System.out.println("Loop through a hashSet");
        for (String car : cars) {
            System.out.println(car);
        }

        cars.clear();
        System.out.printf("Remove all items from a HashSet: %s\n", cars);

        System.out.println("Create a HashSet that should store Integer values");
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 0; i < 10; i++) {
            if (numbers.contains(i)) {
                System.out.printf("%s was found in the set.\n", i);
            } else {
                System.out.printf("%s was not found in the set.\n", i);
            }
        }
    }

    private static void hashMap() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.printf("Create a HashMap: %s\n", capitalCities);

        System.out.printf("Access an item in a HashMap: %s\n", capitalCities.get("England"));

        capitalCities.remove("England");
        System.out.printf("Remove an item from a HashMap: %s\n", capitalCities);

        System.out.printf("Get the size of a HashMap: %s\n", capitalCities.size());

        System.out.println("Loop through a HashMap: ");
        for (String key : capitalCities.keySet()) {
            System.out.printf("Key: %s, Value: %s\n", key, capitalCities.get(key));
        }

        capitalCities.clear();
        System.out.printf("Remove all item from a HashMap: %s\n", capitalCities);

        System.out.println("Create a HashMap that should store String keys and Integer values:");
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String key : people.keySet()) {
            System.out.printf("Name: %s, Age: %s\n", key, people.get(key));
        }
    }
}
