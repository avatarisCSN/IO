package org.example;

import java.io.IOException;

public class codepoint {
    public static void main(String[] args) throws IOException {
        String text = "Привет! 😀 Пока";

        // Получаем кодовую точку для каждого символа в строке
        for (int i = 0; i < text.length(); i++) {
            int codePoint = text.codePointAt(i);
            System.out.print(i);
            System.out.printf("Символ: %c, Кодовая точка: U+%X%n", text.charAt(i), codePoint);

            // Если символ является частью суррогатной пары, нужно пропустить второй символ
            if (Character.isHighSurrogate(text.charAt(i))) {
                i++; // Пропускаем второй символ суррогатной пары
            }
        }
        System.out.printf(" Кодовая точка: U+%X%n",text.codePointAt(8) );
        System.out.printf(" Кодовая точка: U+%X%n",text.codePointAt(9) );
        System.out.println(text.charAt(8));
        System.out.println(text.charAt(9));
    }
}

