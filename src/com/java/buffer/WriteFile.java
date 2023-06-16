package com.java.buffer;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String filename = "buffer.txt";
        try {
            String[] contents = {"Hello World", "Goodbye!...", "បញ្ចូលអក្សរខ្មែរ"};
            FileWriter writer = new FileWriter(filename, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for(String content: contents) {
                bufferedWriter.write(content);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (FileNotFoundException exception){
            System.out.println(filename + " Not Found");
        }
        catch (IOException exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }
    }
}
