package org.example;

import java.io.*;
import java.util.regex.Pattern;

public class NumberValid {

    public static boolean isValidPhone(String input) {
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$";
        return Pattern.matches(regex, input);
    }

    public static void main(String[] args) {


        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("sorted_file.txt"))){
            String line;
            while((line=reader.readLine())!=null){
               if(isValidPhone(line)){
                   writer.write(line);
                   writer.newLine();
               }
            }


        }catch(IOException e){
            System.out.println("Exception"+e.getMessage());
        }
    }
}
