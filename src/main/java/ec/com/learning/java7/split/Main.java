package ec.com.learning.java7.split;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {
        // String text = "Steven;Andres;German;Gregorio";
        String text = "Steven|Andres|German|Gregorio";
        var extract = text.split("\\|", 5);

        for (String element : extract) {
            System.out.println(element);
        }
    }

}
