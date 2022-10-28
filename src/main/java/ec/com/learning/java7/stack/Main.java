package ec.com.learning.java7.stack;

import java.util.Stack;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        /* Stack<String> stack = new Stack<>();
        stack.push("1-Steven");
        stack.push("2-Andres");
        stack.push("3-German");
        stack.push("4-Gregorio");
        // java 8
        stack.forEach(x -> System.out.println(x));
        
        System.out.println("Last element: " + stack.peek());
        System.out.println("Searching 2-Andres: " + stack.search("2-Andres"));
        System.out.println("Searching 1-Andres: " + stack.search("1-Andres"));
        
        System.out.println("LIFO");
        while(!stack.isEmpty()){
            System.out.println("Assisting "+ stack.pop());
            Thread.sleep(500);
        } */
        
        Stack<Person> stack = new Stack<>();
        stack.push(new Person(1, "Steven", 10));
        stack.push(new Person(2, "Andres", 11));
        stack.push(new Person(3, "German", 12));
        stack.push(new Person(4, "Gregorio", 13));
        // java 8
        stack.forEach(x -> System.out.println(x));
        
        System.out.println("Last element: " + stack.peek());
        System.out.println("Searching 2: " + stack.search(new Person(2, "Andres", 11)));
        System.out.println("Searching 1: " + stack.search(new Person(1, "Andres", 11)));
        
        System.out.println("LIFO");
        while(!stack.isEmpty()){
            System.out.println("Assisting "+ stack.pop());
            Thread.sleep(500);
        }
    } 
        
        
    
    
}
