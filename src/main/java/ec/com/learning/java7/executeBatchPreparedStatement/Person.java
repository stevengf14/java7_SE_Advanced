package ec.com.learning.java7.executeBatchPreparedStatement;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Person {

    private int id;
    private String name;
    private String pass;

    public Person(String name, String pass) {
        this.name = name;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
