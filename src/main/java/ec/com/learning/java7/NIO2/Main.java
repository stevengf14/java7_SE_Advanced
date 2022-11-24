package ec.com.learning.java7.NIO2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public void fileOperations(String operation) throws IOException {
        Path path = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\file.txt");
        Path pathDestiny = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\copyFile.txt");

        switch (operation) {
            case "exists":
                boolean exists = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
                System.out.println("File exists: " + exists);
                break;
            case "create":
                if (!Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                    Path newPath = Files.createDirectories(path);
                } else {
                    System.out.println("The file already exists");
                }
                break;
            case "copy":
                if (!Files.exists(pathDestiny, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                    Files.copy(path, pathDestiny, StandardCopyOption.REPLACE_EXISTING);
                } else {
                    System.out.println("The file already exists");
                }
                break;
            case "move":
                Files.move(path, pathDestiny, StandardCopyOption.REPLACE_EXISTING);
                break;
            case "delete":
                Files.delete(pathDestiny);
                break;
        }
    }

    public void read() throws IOException {
        Path path = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\file.txt");
        byte[] bytes = Files.readAllBytes(path);
        for (byte b : bytes) {
            System.out.println((char) b);
        }
    }

    public void write() throws IOException {
        Path path = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\file.txt");
        String text = "Java 7 Advanced";
        Files.write(path, text.getBytes());
    }

    public void readWithChannel() throws IOException {
        RandomAccessFile file = new RandomAccessFile("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\file.txt", "rw");
        FileChannel channel = file.getChannel();

        long size = channel.size();
        ByteBuffer buf = ByteBuffer.allocate((int) size);

        int bytesRead = channel.read(buf);
        while (bytesRead != -1) {
            System.out.println("Readed: " + bytesRead);
            buf.flip();
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }
            buf.clear();
            bytesRead = channel.read(buf);
        }
        file.close();
    }

    public void writeWithChannel() throws IOException {
        RandomAccessFile file = new RandomAccessFile("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\file.txt", "rw");
        FileChannel channel = file.getChannel();
        String text = "Java 7 SE Advanced!";
        ByteBuffer buf = ByteBuffer.allocate(128);
        buf.clear();
        buf.put(text.getBytes());

        buf.flip();
        while (buf.hasRemaining()) {
            channel.write(buf);
        }
        file.close();
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        //app.fileOperations("exists");
        //app.fileOperations("create");
        //app.fileOperations("copy");
        //app.fileOperations("move");
        //app.fileOperations("delete");
        //app.write();
        //app.read();
        app.writeWithChannel();
        app.readWithChannel();
    }

}
