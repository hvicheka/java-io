package com.java.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    public static void main(String[] args) {
        String filename = "stream.txt";
        try {
            FileInputStream inputStream = new FileInputStream(filename);
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        }catch (FileNotFoundException exception) {
            System.out.println(filename + " Not Found");
        } catch (IOException exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }
    }
}
