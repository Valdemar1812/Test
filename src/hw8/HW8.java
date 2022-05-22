package hw8;

import Utils.Utils;

import java.util.Arrays;

import static Utils.Utils.line;
import static Utils.Utils.task;

public class HW8 {
 

    /** № 7.
     Написать метод, который принимает на вход 5 целых чисел,
     и возвращает массив из этих же чисел
     */
    public static int[] task6(int a, int b, int c, int d, int e) {
        int[] task = {a, b, c, d, e};

        return task;
    }

    /** № 8.
     Написать метод, который принимает на вход 5 чисел типа double,
     и возвращает массив из этих же чисел
     */

    public static double[] task8Double(double number1, double number2, double number3, double number4, double number5) {
        double[] taskDouble = new double[5];
         {
            taskDouble[0] = number1;
            taskDouble[1] = number2;
            taskDouble[2] = number3;
            taskDouble[3] = number4;
            taskDouble[4] = number5;
        }

        return taskDouble;
    }

    /** № 9.
     Написать метод, который принимает на вход 5 слов,
     и возвращает массив из этих слов
     */

    public static String[] task9StringArray(String phrase1, String phrase2, String phrase3, String phrase4, String phrase5) {
        String[] task9String = new String[5];
        {
            task9String[0] = phrase1;
            task9String[1] = phrase2;
            task9String[2] = phrase3;
            task9String[3] = phrase4;
            task9String[4] = phrase5;

        }

        return task9String;
    }

    /** №.
     Написать метод, который принимает
     на вход любое количество входных данных
     */

    public static Object[] makeArr(Object ... v) {
        Object[] arr = new  Object[v.length];

        for (int i = 0; i < v.length; i++) {
            arr[i] = v[i];
        }

        return arr;
    }

    /** № 10.
     Написать метод, который принимает на вход массив целых чисел,
     и возвращает массив тех же чисел, умноженных на 2.5
     */

    public static double[] task10(int[] x) {

        if (x.length > 0) {

            double[] result = new double[x.length];

            for (int i = 0; i < x.length; i++) {
                result[i] = (x[i] * 2.5);
            }

            return result;
        }

        return new double[] {};
    }

    /** № 11.
     Написать метод, который принимает
     на вход массив целых положительных чисел,
     и возвращает количество четных чисел в этом массиве
     */

    public static int counEvenElements(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }

        }

        return count;

    }


    public static void main (String[] args) {

        task(5);

        /** № 5.
         Создать объекты типа Integer, Double,
         String и присвоить им такие же значения, как и переменным класса HW8_1
         */

        Integer num = new Integer(333);
        Double x = new Double(333.3);
        String name = new String("Vladimir");

        line();

        task(6);

        /** № 6.
         Сравнить переменные соответствующих типов из классов
         HW8_1 и HW8 и распечатать результат сравнения в виде таблички:
         */

        System.out.println(num.equals(HW8_1.num));
        System.out.println(x.equals(HW8_1.x));
        System.out.println(name.equals(HW8_1.name));

        line();
        task(7);

        /** № 7.
         Написать метод, который принимает на вход 5 целых чисел,
         и возвращает массив из этих же чисел
         */

        System.out.println(Arrays.toString(task6(1,2,3,4,5)));

        line();

        task(8);

        /** № 8.
         Написать метод, который принимает на вход 5 чисел типа double,
         и возвращает массив из этих же чисел
         */

        System.out.println(Arrays.toString(task8Double(2,4,5,6,5)));

        line();

        task(9);

        /** № 9.
         Написать метод, который принимает на вход 5 слов,
         и возвращает массив из этих слов
         */

        System.out.println(Arrays.toString(task9StringArray("Vladimir", "Lilia", "Polina", "Alisa", "Gorik")));

        line();

        System.out.println(Arrays.toString(makeArr(1,2,3,4,5,6,7,8,9,10)));

        line();

        task(10);

        /** № 10.
         Написать метод, который принимает на вход массив целых чисел,
         и возвращает массив тех же чисел, умноженных на 2.5
         */

        System.out.println();

        line();

        task(11);

        /** № 11.
         Написать метод, который принимает
         на вход массив целых положительных чисел,
         и возвращает количество четных чисел в этом массиве
         */

        int[] arrayTask11 = {1, 3, 5, 6, 7};

        System.out.println(counEvenElements(arrayTask11));


    }
}

















