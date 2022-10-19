package ec.com.learning.java7.sortCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(10000);
        list.add(10);
        list.add(23);

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);

        List<String> listString = new ArrayList<>();
        listString.add("Steven");
        listString.add("Andres");
        listString.add("German");
        listString.add("Gregorio");

        Collections.sort(listString);
        Collections.reverse(listString);
        System.out.println(listString);

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Steven", 45));
        people.add(new Person(2, "Andres", 61));
        people.add(new Person(3, "German", 12));
        people.add(new Person(4, "Gregorio", 23));
        
        // Collections.sort(people);

        System.out.println(people);
    }
}
