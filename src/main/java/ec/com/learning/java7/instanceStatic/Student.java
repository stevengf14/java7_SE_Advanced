package ec.com.learning.java7.instanceStatic;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Student extends Person {

    // An instance method cannot be overridden by a static method and vice versa
    
    /*public static int add(int number) {
        return number + 2;
    }*/
    
    public static int add(int number) {
        return number + 2;
    }

}
