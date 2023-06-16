package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String filename = "io.txt";
        try {
            String[] contents = {"Hello World", "Goodbye!...", "បញ្ចូលអក្សរខ្មែរ"};
            FileWriter writer = new FileWriter(filename, false);
            for(String content: contents) {
                writer.write(content);
                writer.write("\r\n");   // write new line
            }
            writer.close();
        } catch (FileNotFoundException exception){
            System.out.println(filename + " Not Found");
        }
        catch (IOException exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }
    }
}
