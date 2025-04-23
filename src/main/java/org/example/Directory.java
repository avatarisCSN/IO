package org.example;

import java.io.File;

public class Directory {

    public static void main(String[] args) {
        File folder = new File("путь/к/каталогу"); // Укажи путь к каталогу
        /*
        */

        if (folder.exists() && folder.isDirectory()) {
            listFilesRecursively(folder);
        } else {
            System.out.println("Каталог не существует или не является директорией.");
        }
    }

    public static void listFilesRecursively(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                // Выводим путь и тип
                if (file.isDirectory()) {
                    System.out.println("[Папка]  " + file.getAbsolutePath());
                    listFilesRecursively(file); // Рекурсивный вызов
                } else {
                    System.out.println("[Файл]   " + file.getAbsolutePath());
                }
            }
        }
    }
}