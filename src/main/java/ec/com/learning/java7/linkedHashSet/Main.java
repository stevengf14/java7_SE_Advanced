package ec.com.learning.java7.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {

        Set<Person> list = new LinkedHashSet<>();
        list.add(new Person(1, "Steven", 10));
        list.add(new Person(1, "Steven Andres", 10));
        list.add(new Person(1, "Andres", 10));
        list.add(new Person(1, "Andres", 10));
        list.add(new Person(1, "Steven", 10));
        list.add(new Person(1, "German", 10));

        list.forEach(person -> {
            System.out.println(person);
        });
    }

}
