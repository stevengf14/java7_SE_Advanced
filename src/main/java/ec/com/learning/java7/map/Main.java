package ec.com.learning.java7.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new TreeMap<>();
        /* Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Steven");
        map.put(2, "Andres");
        map.put(1, "German");
        map.put(4, "Gregorio");
        map.put(5, "Sofia");
        map.put(null, "Andy");
        map.put(5, "Steve");

        // java > 8
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }); */
        
        Map<Person, String> map = new HashMap<>();
        // Map<Person, String> map = new TreeMap<>();
        // Map<Person, String> map = new LinkedHashMap<>();
        map.put(new Person(3, "Steven", 10), "Steven");
        map.put(new Person(1, "Andres", 10), "Andres");
        map.put(new Person(2, "German", 10), "German");
        map.put(new Person(4, "Gregorio", 10), "Gregorio");
        map.put(new Person(5, "Sofia", 10), "Sofia");
        map.put(null, "Andy");
        map.put(new Person(5, "Steven", 10), "Steve");
        map.put(new Person(6, "Steven", 10), null);

        // java > 8
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
    }

}
