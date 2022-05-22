package hw8;

import Utils.Utils;

import static Utils.Utils.*;

public class HW8_1 {

    /** № 3.
     В классе HW8_1:
     Создать объекты типа Integer, Double, String и присвоить им любые значения.
     */

    public static Integer num = new Integer(333);
    public static Double x = new Double(333.3);
    public static String name = new String("Vladimir");


    public static void main(String[] args) {

        task(1);

        /** № 1.
         В вашем проекте создать класс Utils(или Helpers)
         и перенести в него вспомогательные методы, которые
         вам помогают выполнять ЛЮБОЕ домашнее задание.
         */

        line();

        task(2);

        /** № 2.
         В вашем проекте создать пакет hw8,  в этом пакете создать классы HW8 и HW8_1
         */

        line();

        task(3);

        /** № 3.
         В классе HW8_1:
         Создать объекты типа Integer, Double, String и присвоить им любые значения.
         */

        System.out.println(num);
        System.out.println(x);
        System.out.println(name);

        line();







    }
}
