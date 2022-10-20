package ec.com.learning.java7.sortCollectionsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        // Collections.sort(people, new NameComparator());
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person per1, Person per2) {
                if (per1.getAge() > per2.getAge()) {
                    return 1;
                } else if (per1.getAge() < per1.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        people.forEach(p -> {
            System.out.println(p.getName());
        });
    }
}
