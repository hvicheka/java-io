package com.java.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String filename = "buffer.txt";
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException exception) {
            System.out.println(filename + " Not Found");
        } catch (IOException exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }
    }
}
