package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {
        try(OutputStream output = new FileOutputStream("a.txt");
            InputStream input = new FileInputStream("a.txt")) {
            char[] symbols = {'a', 'Ж', '😀'};

            for (int i:symbols) {
                // Запись каждого символа в текстовый файл
                output.write(i);
            }
            int size = input.available();
            System.out.println(input.available());

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}