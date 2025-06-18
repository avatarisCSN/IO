package goit;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Second {
    public static void main(String[] args) {
        User person = new User("Bill", 30);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        System.out.println(json);
        try(FileReader reader = new FileReader("src/main/resources/file2.txt");
            FileWriter writer = new FileWriter("src/main/resources/file2_out.txt");
        ) {
        } catch(IOException e) {
            System.out.println("exception" + e.getMessage());
        }
    }
}

