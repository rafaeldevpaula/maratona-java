package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    // File
    // FileWriter
    // FileReader
    // BufferedWriter
    // BufferedReader
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("1234567890000000");
            br.newLine();
            br.flush();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
