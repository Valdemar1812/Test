package lesson;

import Utils.Utils;

public class Lesson8 {

    public static void line() {

        System.out.println("_______________");
    }

    public static void main(String[] args) {



        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");

        System.out.println(cat1 == cat3); // false
        System.out.println(cat1 == cat2); // true
        System.out.println(cat1.equals(cat2)); // true
        System.out.println(cat1.equals(cat3)); // true


        System.out.println("___________________");

        Integer a = 1;
        Integer a1 = 1;
        Integer a3 = new Integer(1);

        System.out.println("___________________");

        Utils.line();


















    }
}
