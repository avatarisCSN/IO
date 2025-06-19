package org.example;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ByteFrequency {

    public static void main(String[] args) {
        HashMap<Byte,Integer> map = new HashMap<>();
        map.put((byte) 1,0);
        try( FileInputStream in = new FileInputStream("Files/texter.txt"))
        {
            int b;
            while ((b=  in.read())!=-1){
                byte key = (byte)b;
                map.put(key,map.getOrDefault(key,0)+1);
            }
        }catch(IOException e){
            System.out.println("exception"+e.getMessage());
        }
        for (HashMap.Entry<Byte, Integer> entry : map.entrySet()) {
            byte key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("Байт %3d (символ '%s') встречается %d раз(а)%n",
                    key & 0xFF, // чтобы отобразить положительное значение
                    (key >= 32 && key < 127) ? (char) key : ".",
                    value);
        }


    }
}
