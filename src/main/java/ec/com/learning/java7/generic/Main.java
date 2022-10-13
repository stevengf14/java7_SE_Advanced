package ec.com.learning.java7.generic;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Generic I
        
        Class<String> c = new Class<>("Steven");
        c.showType();
        
        Class<Integer> c1 = new Class<>(1);
        c1.showType();
        
    }
    
}
