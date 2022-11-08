package ec.com.learning.java7.linealCatch;

import java.io.IOException;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public void show(){
        try{
            throw new IOException("IOException");
        } catch(NullPointerException | IOException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Main app = new Main();
        app.show();
    }
    
}
