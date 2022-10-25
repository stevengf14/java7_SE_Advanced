package ec.com.learning.java7.hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {
        /*Set<String> list = new HashSet<>();
        list.add("Steven");
        list.add("Andres");
        list.add("German");
        list.add("Gregorio");
        list.add("Steven");
        list.add("Lucia");
        list.add("Fernando");
        list.add("German");
        list.add("Pedro");
        
        for (String element : list) {
            System.out.println(element);
        }*/

        Set<Person> list = new HashSet<>();
        list.add(new Person(1, "Steven", 10));
        list.add(new Person(1, "Steven Andres", 10));
        list.add(new Person(1, "Andres", 10));
        list.add(new Person(1, "Andres", 10));
        list.add(new Person(1, "Steven", 10));
        list.add(new Person(1, "German", 10));

        for (Person person : list) {
            System.out.println(person);
        }
    }

}
