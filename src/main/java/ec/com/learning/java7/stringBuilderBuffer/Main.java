package ec.com.learning.java7.stringBuilderBuffer;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {
        
        // StringBuilder sb = new StringBuilder();
        // You can set the capacity (multiple of 4)
        // StringBuilder sb = new StringBuilder(32);
        
        StringBuilder sb = new StringBuilder("Steven Andres");
        
        // sb.append("Steven").append(" Andres");
        
        // System.out.println(sb);
        
        // String Builder is dynamic (it has not only 16 character of capacity)
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        
        // to reset the String Builder
        sb.setLength(0);
        System.out.println(sb.toString());
        
        // StringBuilder is faster than StringBuffer
        // StringBuilder is not threadsafe no sync methods, StringBuffer do
        // Use StringBuffer -> sync methods -> the integrity of the information is important
        // Use StringBuilder -> no sync methods -> it's not important the integrity of the information -> is faster
        StringBuffer sbf = new StringBuffer();
    }
    
}
