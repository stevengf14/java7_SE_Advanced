package ec.com.learning.java7.initialCapacity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {
    
    public static void main(String[] args){
        List<String> list = new ArrayList<>(300);
        System.out.println(list.toString());
        
        // LinkedList doesn't have initial capacity
    }
}
