package lesson10StringChar;

import java.util.Arrays;
import java.util.Locale;

public class Lesson10 {

    public static void main(String[] args) {

        // как было раньше, для новичков

        String str1 = "Java";
        String str2 = "Js";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');
        System.out.println(aa.equals(aaa));

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;

        System.out.println(str4); // отдельный участок памяти который хранит все значения

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));

        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));

        }

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                // array[i]
                System.out.println(str4.charAt(i)); // печатаем букву
                System.out.println(i); // печатаем индекс
            } else {
                System.out.println("Leter is not a");
            }
        }




        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) < 'i') {
                System.out.println(str4.charAt(i)); // печатаем букву
            } else {
                System.out.println(">= i");
            }
        }

        System.out.println(Character.toString('i' + 1)); // метод позволяющий распечатать численное содержание в виде буквы

        System.out.println('i' + 1); // напечатает численное содержимое

        // перевели строку в массив букв
        String[] arrayStr = new String[str4.length()];
        for (int i = 0; i < str4.length(); i++) {
            arrayStr[i] = Character.toString(str4.charAt(i));
        }

        System.out.println(Arrays.toString(arrayStr));

        //

        System.out.println(str4);
        System.out.println(str4.toLowerCase()); // все с маленькой буквы
        System.out.println(str4.toUpperCase()); // все с большой буквы












    }
}
