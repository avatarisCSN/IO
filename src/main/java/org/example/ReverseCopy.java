package org.example;

import java.io.*;

public class ReverseCopy {
    public static void main(String[] args) {

        try(BufferedReader input = new BufferedReader(new FileReader("texter.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("copy_texter.txt"))) {
            StringBuilder line;
                while((line= new StringBuilder(input.readLine()))!=null)
                    output.write(String.valueOf(line.reverse()));
            System.out.println(String.valueOf(line));
        }catch(IOException e){
            System.out.println("Exception");
        }
    }
}
