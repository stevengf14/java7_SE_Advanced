package ec.com.learning.java7.treeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {
        Set<String> listString = new TreeSet<>();
        listString.add("Steven");
        listString.add("Andres");
        listString.add("German");
        listString.add("Gregorio");
        listString.add("German");
        listString.add("Andrea");

        listString.forEach(element -> {
            System.out.println(element);
        });

        Set<Person> list = new TreeSet<>();
        list.add(new Person(1, "Steven", 10));
        list.add(new Person(2, "Andres", 11));
        list.add(new Person(3, "German", 12));
        list.add(new Person(4, "Gregorio", 13));
        list.add(new Person(3, "German", 12));
        list.add(new Person(6, "Andrea", 15));

        list.forEach(person -> {
            System.out.println(person);
        });
    }

}
