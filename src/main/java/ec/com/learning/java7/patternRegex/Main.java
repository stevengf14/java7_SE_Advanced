package ec.com.learning.java7.patternRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {

        /*Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher = pattern.matcher("asm");
        System.out.println(matcher.matches());*/
        
        String regex = "^[a-z0-9._%+\\-]+@[a-z0-9.\\-]+\\.[a-z]{2,4}$";
        
        long init = System.currentTimeMillis();
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < 1000; i++) {
            String[] text = pattern.split("Steven;Andres;German;Gregorio");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - init);

        ///////////////////////////////
        long initSplit = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            String[] text = "Steven;Andres;German;Gregorio".split(regex);
        }
        long endSplit = System.currentTimeMillis();
        System.out.println(endSplit - initSplit);

    }

}
