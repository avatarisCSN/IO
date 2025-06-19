package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bin=0;
        System.out.println(new File(".").getAbsolutePath());
        try (
                InputStreamReader fin = new InputStreamReader(
                        new FileInputStream("Files/input.txt"), StandardCharsets.UTF_8);
                OutputStreamWriter fout = new OutputStreamWriter(
                        new FileOutputStream("Files/output.txt"), StandardCharsets.UTF_8)
        ) {
            int i;
            String outputPath = "src/main/resources/output.txt";


            while ((i = fin.read()) != -1) {
                fout.write(i);
                System.out.println((char)i);
                bin++;
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println(bin);
    }
}