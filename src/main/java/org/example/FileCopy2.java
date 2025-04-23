package org.example;

import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("notes.txt"));
             BufferedWriter output = new BufferedWriter(new FileWriter("notes_copied.txt"))){
            while (input.read()!=-1){
                System.out.println(input.read());
                output.write(input.read());

            }

        } catch (IOException e){
            System.out.println("hello exception");
        }
    }
}
