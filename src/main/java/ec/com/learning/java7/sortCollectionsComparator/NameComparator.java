package ec.com.learning.java7.sortCollectionsComparator;

import java.util.Comparator;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class NameComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Person per1 = (Person) obj1;
        Person per2 = (Person) obj2;

        return per1.getName().compareTo(per2.getName());
    }

}
