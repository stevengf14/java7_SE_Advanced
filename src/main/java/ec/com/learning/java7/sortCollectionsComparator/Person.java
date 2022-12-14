package ec.com.learning.java7.sortCollectionsComparator;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        // return person.getAge() - this.age;
        return this.name.compareTo(person.getName());
    }

}
