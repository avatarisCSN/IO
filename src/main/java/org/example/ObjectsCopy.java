package org.example;

import java.io.*;

public class ObjectsCopy {
    public static void main(String[] args) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Files/obj.dat"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Files/obj.dat"))
        ) {
            out.writeObject(new Person("Bill",28,"fisherman"));
            out.writeObject(new Person("Jhon",41,"bowman"));
            out.writeObject(new Person("Mike",33,"smither"));
            Object person = in.readObject();
            System.out.println(person.toString());

        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception");
        }
    }
}
