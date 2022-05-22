package homework;

import com.sun.source.util.SourcePositions;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Type;
import java.net.SocketOption;


public class HW3 {

    static void task () {
        int n = 1;
        System.out.println("Task" + n);
        n++;
        ;
    }

    public static void main(String[] args) {

        String line = " ---------------------------";

        String min = " Минимальное значение = ";
        String max = " Максимальное значение = ";


        /**
         Задание 2. Создайть переменные a и b типа byte, присвоить им значения из допустимого диапазона.
          */
        task();

        task();

        System.out.println(" < Задание № 2 >");

        byte a = 100;
        byte b = - 77;

        System.out.println(min + Byte.MIN_VALUE + ";"); // -128
        System.out.println(max + Byte.MAX_VALUE + ";"); // 127


        System.out.println(a);
        System.out.println(b);

        System.out.println(line);

        /**
        Задание 3. Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
         */

        System.out.println(" < Задание № 3 >");

        short s = 30000;
        short t = 30000 - 60000;

        System.out.println(s + ", " + t);

        System.out.println(line);

        /**
         Задание 4. Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         Затем присвоить максимально возможное значение этого типа.
         */

        System.out.println(" < Задание № 4 >");

        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;

        System.out.println(
                "        Таблица значений:" + "\n"
          + "____________________________" + "\n"
          + "| int min    | " + minI + " | " + "\n"
          + "----------------------------" + "\n"
          + "| int max    | " + maxI + "  | " + "\n"
          + "----------------------------"
        );

        /**
         Задание 5. Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны
         и города (можно ненастоящий номер телефона, например, 18009998877)
         */

        System.out.println(" < Задание № 5 >");

        long phoneNumber = 9990090201L;

        System.out.println("Номер телефона этого товарища - + 7" + phoneNumber + "!");

        /**
         Задание 6. Создать переменную f типа float и присвоить ей значение 100.101101.
         Создать переменную d типа double и присвоить ей значение 100.101101.
         */

        System.out.println(" < Задание № 6 >");

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println("        Таблица значений");
        System.out.println(
                "____________________________________________________________" + "\n"
                + "| float f = 100.101101                | " + f + "         | " + "\n"
                + "------------------------------------------------------------" + "\n"
                + "| double d = 100.101101               | " + d + "         | " + "\n"
                + "------------------------------------------------------------"
        );

        /**
         Задание 7.
         a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999
         и 20.099999.
         b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999
         и 20.099999.
         */

        Double dd;
        dd = 10.09999 + 20.099999;
        Float ff;
        ff = 10.09999F + 20.099999F;

        System.out.println(
                "| Double dd = 10.09999 + 20.099999    | " + dd + " | " + "\n"
                + "------------------------------------------------------------" + "\n"
                + "| Float ff = 10.09999F + 20.099999F   | " + ff + "           | " + "\n"
                + "------------------------------------------------------------"
        );

        System.out.println(" < Решение к заданию № 7 прикреплено к таблице выше (3 и 4 строки)!!! >");

        System.out.println(line);

        /**
         Задание 8.
         Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
         */

        System.out.println(" < Задание № 8 >");

        double result = 10.0 / 3.0;

        System.out.println(result);

        System.out.println(line);

        /**
         Задание 9.
         Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d
         */

        System.out.println(" < Задание № 9 >");

        // float f = 100.101101F;
        // double d = 100.101101;

        double sum = f + d;
        double product = f - d;
        double quotient  = f / d;
        double remainder  = f % d;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        System.out.println(line);

        /**
         Задание 10.
         Распечатать слово HELLO точками
         */

        System.out.println(" < Задание № 10 >");

        String o = "*"; // ".";

        System.out.println(
               o + o + " " + o + o + "   " + o + o + o + o + o + "   " + o + o + "  " + o + o + "  " + o + o + o + o + o + "\n" +
               o + o + " " + o + o + "   " + o + o + "      " + o + o + "  " + o + o + "  " + o + "   " + o + "\n" +
               o + o + o + o + o + "   " + o + o + o + o + o + "   " + o + o + "  " + o + o + "  " + o + "   " + o + "\n" +
               o + o + " " + o + o + "   " + o + o + "      " + o + o + "  " + o + o + "  " + o + "   " + o + "\n" +
               o + o + " " + o + o + "   " + o + o + o + o + o + "   " + o + o + "  " + o + o + "  " + o + o + o + o + o + "\n"
        );

        System.out.println(line);

        /**
         Задание 11.
         Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         t1 = 0; // byte
         t2 = 150; // short
         t3 = -120; // byte
         t4 = - 505.505; // float
         t5 = 100100; // int
         t6 = 100010001000; // long
         t7 = 2.66666666666666; // long
         t8 = - 1000000.001; // double
         t9 = 1010; // short
         */

        System.out.println(" < Задание № 11 >");

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
        System.out.println("t7 = " + t7);
        System.out.println("t8 = " + t8);
        System.out.println("t9 = " + t9);

        System.out.println(line);

        /**
         Задание 12.
         С помощью полей классов ссылочного типа распечатать таблицу:
         */

        System.out.println(" < Задание № 12 >");


        System.out.println(
                " | Type      | Size in bits  | min                  |  max                   |" + " \n "
                + "| " + Byte.TYPE + "      | " + Byte.SIZE + "             | " + Byte.MIN_VALUE + "                 | " + Byte.MAX_VALUE + "                    |" + " \n"
                + " | " + Short.TYPE + "     | " + Short.SIZE + "            | " + Short.MIN_VALUE + "               | " + Short.MAX_VALUE + "                  |" + " \n"
                + " | " + Integer.TYPE + "       | " + Integer.SIZE + "            | " + Integer.MIN_VALUE + "          | " + Integer.MAX_VALUE + "             |" + " \n"
                + " | " + Long.TYPE + "      | " + Long.SIZE + "            | " + Long.MIN_VALUE + " | " + Long.MAX_VALUE + "    |" + " \n"
                + " | " + Float.TYPE + "     | " + Float.SIZE + "            | " + Float.MIN_VALUE + "              | " + Float.MAX_VALUE + "           |" + " \n"
                + " | " + Double.TYPE + "    | " + Double.SIZE + "            | " + Double.MIN_VALUE + "             | " + Double.MAX_VALUE + " |" + " \n"
        );

        System.out.println(line);

        /**
         Задание 13.
         Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
         сравнить 2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
         “Если num1 = num2, то результат сравнения методом .equal = …”
         */

        System.out.println(" < Задание № 13 >");

        Integer num1 = 333;
        Integer num2 = 333;

        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num2 = 13;

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));

        System.out.println(line);

        /**
         Задание 14.
         Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         а) одинаковыми значениями
         b) number1 < number2
         c) number1 > number2
         сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         и вывести результаты сравнения на печать в виде выражений:
         “Если number1 = number2, то результат сравнения методом … = …”
         “Если number1 < number2, то результат сравнения методом … = …”
         “Если number1 > number2, то результат сравнения методом … = …”

         */

        System.out.println(" < Задание № 14 >");

        int number1 = 123;
        int number2 = 123;

        Integer results = Integer.compare(number1,number2);

        System.out.println("Если number1 = number2, то результат сравнения методом compare  = " + results);

        number1 = 3;
        number2 = 6;

        Integer results1 = Integer.compare(number1,number2);

        System.out.println("Если number1 < number2, то результат сравнения методом compare = " + results1);

        number1 = 9;
        number2 = 5;

        Integer results2 = Integer.compare(number1,number2);

        System.out.println("Если number1 > number2, то результат сравнения методом compare = " + results2);

        System.out.println(line);

        /**
         Задание 15.
         Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */

        System.out.println(" < Задание № 15 >");

        Float num = 234.9999F;

        int x = num.intValue();

        System.out.println(x);

        System.out.println(line);

        















































    }
}