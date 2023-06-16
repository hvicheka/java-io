package com.java.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteFile {
    public static void main(String[] args) {
        String filename = "stream.txt";
        try {
            String[] contents = {"Xin chào", "Hẹn gặp lại!", "បញ្ចូលអក្សរខ្មែរ"};
            FileOutputStream outputStream = new FileOutputStream(filename);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            for (String content : contents) {
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
