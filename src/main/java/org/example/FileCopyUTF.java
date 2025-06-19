package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileCopyUTF {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("Files/notes.txt"), StandardCharsets.UTF_8));
             BufferedWriter output = new BufferedWriter(new FileWriter("Files/notes_copied2.txt"))){
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.println((char)ch);
                output.write(ch);

            }

        } catch (IOException e){
            System.out.println("hello exception");
        }
    }
}
