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
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.json"));
        ) {
            writer.writeObject(person);
            System.out.println("Объект успешно записан");
        } catch(IOException e) {
            System.out.println("exception " + e.getMessage());
        }
    }
}

