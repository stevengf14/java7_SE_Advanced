package ec.com.learning.java7.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public void readWithBufferedInputStream() {
        long init = System.currentTimeMillis();
        int value = 16 * 1024;
        try (InputStream fis = new BufferedInputStream(new FileInputStream("src\\main\\java\\ec\\com\\learning\\java7\\fileInputStream\\file.gif"), value)) {
            int i = fis.read();
            while (i != -1) {
                // System.out.println((char) i);
                i = fis.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println("Time BufferedInputStream " + (end - init));
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.readWithBufferedInputStream();
    }

}
