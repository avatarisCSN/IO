package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCopy {
    public static void main(String[] args) {
        int lines=0;
        int words=0;
        int symbols=0;
        String[] splitted;

        try (BufferedReader input = new BufferedReader(new FileReader("Files/texter.txt"))) {

            // Сначала читаем все строки
            String line;
            while ((line = input.readLine()) != null) {
                lines++;
                symbols++;
                splitted = line.split(" ");
                for(String s:splitted){
                    words++;
                    symbols+=s.length()+1;

                }
            }

            System.out.println("строк "+lines+" слов "+words+" символов "+symbols);

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}