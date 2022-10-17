package ec.com.learning.java7.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public void toListUpperBounded(List<? extends Person> list) {
        // java 8
        // list.stream().map(x->x.getName()).forEach(System.out::println);
        // list.stream().forEach(x->System.out.println(x.getName()));

        for (Person p : list) {
            System.out.println(p.getName());
        }
    }
    
    public void toListLowerBounded(List<? super Student> list) {
        for (Object obj : list) {
            System.out.println(((Student)obj).getName());
        }
    }
    
    public void toListUnBounded(List<?> list) {
        for (Object obj : list) {
            System.out.println(((Student)obj).getName());
        }
    }

    public static void main(String[] args) {
        Main app = new Main();

        Person st1 = new Person("Steven");
        Student st2 = new Student("Andres");
        Teacher st3 = new Teacher("German");
        Student st4 = new Student("Gregorio");

        List<Person> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        app.toListUpperBounded(list);
    }

}
