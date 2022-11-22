package ec.com.learning.java7.readersWriters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    private int BUFFER_SIZE = 8 * 1024;

    public void read() throws IOException {
        try (Reader reader = new BufferedReader(new FileReader("src\\main\\java\\ec\\com\\learning\\java7\\readersWriters\\file.txt"), BUFFER_SIZE)) {
            int data = reader.read();
            System.out.println((char) data);
            while (data != -1) {
                data = reader.read();
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void write() throws IOException {
        try (Writer writer = new BufferedWriter(new FileWriter("src\\main\\java\\ec\\com\\learning\\java7\\readersWriters\\file.txt", true), BUFFER_SIZE)) {
            writer.write("\nWhat's up everybody!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        app.read();
        app.write();
        app.read();
    }

}
