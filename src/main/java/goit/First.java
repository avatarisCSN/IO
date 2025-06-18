package goit;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args)  {
        Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");
        try (
                BufferedReader  fileIn = new BufferedReader(new FileReader("src/main/resources/file.txt"));
                BufferedWriter fileOut = new BufferedWriter(new FileWriter("src/main/resources/file_out.txt"))
        ) {
            String line;
            String result;
            while ((line = fileIn.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while(matcher.find()) {
                    result = matcher.group();
                    System.out.println(result);
                    fileOut.write(result);
                    fileOut.newLine();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}