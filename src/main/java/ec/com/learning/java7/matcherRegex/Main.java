package ec.com.learning.java7.matcherRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {
        String text = "This is a text from MitoCode class java7 advanced - mitocode";
        Pattern pattern = Pattern.compile("mitocode", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        // boolean b = Pattern.compile(".*mitocode.*", Pattern.CASE_INSENSITIVE).matcher(text).matches();

        System.out.println("matches: " + matcher.matches());

        System.out.println("lookingAt: " + matcher.lookingAt());

        int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println("Coincidence No. " + counter + " start: " + matcher.start() + " end: " + matcher.end()
        
    

);
        }
    }

}
