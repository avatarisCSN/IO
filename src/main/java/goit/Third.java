package goit;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Third {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/file3.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/file3_out.txt"))) {

            String line;
            String[] words;
            int value;
            while((line = reader.readLine()) != null) {
                words = line.split(" ");
                for (String str: words) {
                    if(map.containsKey(str)) {
                        value = map.get(str)+1;
                        map.put(str, value);
                    } else {
                        map.put(str, 0);
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + " " + (entry.getValue()+1));
                writer.newLine();
            }

        } catch(IOException e) {
            System.out.println("error - " + e.getMessage());
        }
    }
}
