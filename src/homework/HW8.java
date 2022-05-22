package homework;

import hw8.HW8_1;

import java.util.Arrays;

import static Utils.Utils.*;

public class HW8 {

    /** № 7.
     Написать метод, который принимает на вход 5 целых чисел,
     и возвращает массив из этих же чисел
     */
    public static int[] task6(int a, int b, int c, int d, int e) {
        int[] task = new int[5];
        for (int i = 0; i < task.length; i++) {
            task[0] = a;
            task[1] = b;
            task[2] = c;
            task[3] = d;
            task[4] = e;
        }

        return task;
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













    }
}
