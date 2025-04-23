package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class PrintWriterEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try(PrintWriter input = new PrintWriter("log.txt")){
            String line;
            while(scan.hasNext()){
                if(scan.nextLine()=="exit"){
                    break;
                }
                line = scan.nextLine();
                input.printf("[%s] Пользователь ввёл: %s%n", LocalDateTime.now(), line);
                System.out.println(" Пользователь ввёл: "+ LocalDateTime.now()+ line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage()+"exception");
        }

    }
}
