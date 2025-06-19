package org.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonTest {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();


        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/file2.txt"));
             FileWriter output = new FileWriter("Files/output.json")) {

            String[] input = reader.readLine().split(" ");

            String line;
            while((line = reader.readLine()) != null) {
                String[] value = line.split(" ");
                jsonObject.put(input[0], value[0]);
                jsonObject.put(input[1], value[1]);
                output.write(jsonObject.toString(2));
                System.out.println(input[0] + " " + value[0]);
            }


            System.out.println("JSON успешно записан в файл.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}