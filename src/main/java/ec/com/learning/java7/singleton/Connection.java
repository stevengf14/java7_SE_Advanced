package ec.com.learning.java7.singleton;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Connection {

    private static Connection instance = null;

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }
    
    // private constructor
    private Connection(){
        
    }

}
