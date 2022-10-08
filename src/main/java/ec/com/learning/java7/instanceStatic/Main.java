package ec.com.learning.java7.instanceStatic;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {
        
        // The method of the subclass overrides the method of the parent class.
        Student student = new Student();
        System.out.println(student.add(0));
        
        // If I have two static methods, the method of the upper class is hidden (does not override it)
        System.out.println(Student.add(0));
    }
    
}
