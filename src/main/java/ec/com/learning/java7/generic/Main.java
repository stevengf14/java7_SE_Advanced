package ec.com.learning.java7.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) {

        // Generic I
        /*Class<String> c = new Class<>("Steven");
        c.showType();
        
        Class<Integer> c1 = new Class<>(1);
        c1.showType();*/
        // Generic II
        /*// List list = new ArrayList();
        List<String> list = new ArrayList();
        list.add("Steven");
        //list.add(1);
        //String text = (String)list.get(0); // casting
        
        String[] array = new String[2];
        array[0]="Steven";
        // array[1]=1;*/
        Class<String, Integer, String, Double> c = new Class<>("Steven", 123, "Andres", 12.3);
        c.showType();
        System.out.println("----------------");
        
        List<Class<String, Integer, String, Double>> list = new ArrayList<>();
        list.add(new Class("Steven", 123, "Andres", 12.3));
        list.add(new Class("Andres", 345, "Jose", 34.3));
        list.add(new Class("Anorra", 678, "Esteban", 56.3));

        for (Class<String, Integer, String, Double> cl : list) {
            cl.showType();
            System.out.println("***************");
        }
    }

}
