package org.example.one.day3;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhao
 * @time 2021/2/16 19:34
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        String path = "/Users/zhao/Desktop/";
        String file = "1.txt";
        FileWriter writer = new FileWriter(path + file);
        writer.write("阿里巴巴Java训练营");
        writer.flush();
        writer.close();
    }

    @Test
    public void read() throws IOException {
        String path = "/Users/zhao/Desktop/";
        String file = "1.txt";
        FileReader reader = new FileReader(path + file);
        char buffer[] = new char[1024];
        while (reader.read(buffer) > 0) {
            System.out.println(buffer);
        }
        reader.close();
    }
}
