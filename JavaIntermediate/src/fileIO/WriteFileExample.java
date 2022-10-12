package fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriteFileExample {
    public static void main(String[] args) {
        String filePath = "JavaIntermediate\\src\\fileIO\\IOExample.txt";
        try {
            Writer w = new FileWriter(filePath);
            w.write("Has anyone really been far even as decided to use even go want to do look more like?");
            w.close();
            System.out.println("Wrote to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Reader r = new FileReader(filePath);
            int data = r.read();
            System.out.println("The following was read from the file:");
            while (data != -1) {
                System.out.print((char) data);
                data = r.read();
            }
            System.out.println();
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
