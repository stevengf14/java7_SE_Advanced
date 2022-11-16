package ec.com.learning.java7.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public void readByFileInputStream() throws IOException {
        long init = System.currentTimeMillis();
        try (InputStream fis = new FileInputStream("src\\main\\java\\ec\\com\\learning\\java7\\fileInputStream\\file.gif")) {
            byte[] arr = new byte[1024];
            int i = fis.read(arr);

            while (i != -1) {
                // System.out.println("readed bytes " + i);
                i = fis.read(arr);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println("Time bytes[] " + (end - init));

        // traditional read
        init = System.currentTimeMillis();
        try (InputStream fis = new FileInputStream("src\\main\\java\\ec\\com\\learning\\java7\\fileInputStream\\file.gif")) {

            int i = fis.read();

            while (i != -1) {
                // System.out.println("readed bytes " + i);
                i = fis.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        end = System.currentTimeMillis();
        System.out.println("Time bytes " + (end - init));
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        app.readByFileInputStream();
    }

}
