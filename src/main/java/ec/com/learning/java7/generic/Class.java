package ec.com.learning.java7.generic;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Class<T> {

    private T object;

    public Class(T object) {
        this.object = object;
    }

    public void showType() {
        System.out.println("T is: " + object.getClass().getName());
    }
}
