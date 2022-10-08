package ec.com.learning.java7.instanceOf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    private List basket = new ArrayList();

    public static void main(String[] args) {
        /*String text = new String("Steven");
        if(text instanceof String){
            System.out.println("It's a String");
        }*/

 /*Student student = new Student();
        if(student instanceof Student){
            System.out.println("It's a Student");
        }
        if(student instanceof Person){
            System.out.println("It's a Person");
        }*/
        // There is a basket where only fruit should be allowed to enter
        System.out.println("Basket open, please enter only fruits");

        Apple ap1 = new Apple("Red");
        Apple ap2 = new Apple("Green");
        Orange o1 = new Orange("Seedless");
        Cookie c1 = new Cookie("Chocolate");

        Main app = new Main();
        app.verify(ap1);
        app.verify(ap2);
        app.verify(o1);
        app.verify(c1);
    }

    public void verify(Object object) {
        if (object instanceof Fruit) {
            basket.add(object);
            System.out.println("Fruid added " + object.getClass().getSimpleName() + " " + ((Fruit) object).getName());
        } else {
            System.out.println("This element is not a fruit " + object.getClass().getSimpleName());
        }
    }

}
