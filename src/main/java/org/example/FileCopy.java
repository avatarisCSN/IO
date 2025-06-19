package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args)  {


        try (
                FileInputStream fileIn = new FileInputStream("Files/file.txt");
                FileOutputStream fileOut = new FileOutputStream("Files/copied_file.txt")
        ) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}