package homework;

public class HW6 {

    static int n = 1;

    public static void task() {

        System.out.println("\u001B[35m ******\u001B[33m Task \u001B[0m \u001B[36m №  " + n + "\u001B[0m" + "\u001B[35m ****** \u001B[0m");
        n++;

    }

    public static void line() {
        System.out.println("________________________________________");
    }

    /**
     № 10. Написать метод, который принимает на вход параметры start,  end, step,
     и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
     Точка выхода из цикла - число end.
     */

    public static void startEndStep(int start, int end, int step) {

        int i;
        for (i = start; i < end + 1; i += step)
            System.out.println(i);

    }/**
     № 11. Написать метод, который принимает параметр l
     и печатает  последовательность четных чисел от нуля.
     Длина последовательности = l.
     */

    public static void numbersL(int l) {
        int i;
        for (i = 0; i < l +1; i = i + 2)
            System.out.println(i);

    }

    /**
     № 12. Напишите метод,
     который принимает целое число n,
     и выводит все степени числа 2 от 1 до n включительно
     */

    public static void numbersN(int n) {
        int i;
        for (i = 1; i < n + 1; i++)
            System.out.println(n *= 2);
    }


    /**
     № 13. Вывести последовательность 012345678900112233445566778899000…
     до числа 9999 включительно.
     */

    public static String thirteenth() {

            String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";

        for (int i = 0; i < 10; i++) {
            result = result + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }

        return result + result2 + result3 + result4;

    }

    /**
     № 16. Написать метод, который принимает параметры n, m,
     l, и печатает последовательность нечетных чисел начиная
     с числа n, с шагом m,  длина последовательности  l.
     */

    public static void task16 (int n, int m, int l) {
        for (int i = n; i < l + 1; i = i + m) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     № 17. Сгенерируйте и распечатайте последовательность
     по формуле: n + 1 = n + 2
     */

    public static void seq17 (int n) {
        int l = n + 5;
        for ( ; n < l; n++) {
            System.out.println("(" + (n + 1) + ")" + " = " + (n + 2));
        }
    }


    public static void main(String[] args) {

        /**
         № 1. Распечатать последовательность чисел от 0 до 9 включительно.
         */

        task();

        for (int i = 0; i < 10; i++)
            System.out.println(i);

        line();

        /**
         № 2. Распечатать последовательность чисел от 10 исключительно до 0 включительно.
         */

        task();

        for (int i = 10; i > -1; i--)
            System.out.println(i);

        line();

        /**
         № 3. Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
         */

        task();

        for (int i = 50; i < 56; i += 2)
            System.out.println(i);

        line();

        /**
         № 4. Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         */

        task();

        for (int i = 327; i > 299; i--)
            if (i % 7 == 0) {
                System.out.println(i);
            }

        line();

        /**
         № 5. Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */

        task();

        for (double i = 12.0; i < 13.1; i += 0.1)

            System.out.println(i);

        line();

        /**
         № 6. Распечатать последовательность четных чисел от 215 до 237 включительно
         */

        task();

        for (int i = 215; i < 238; i++)
            if (i % 2 == 0)
                System.out.println(i);

        line();

        /**
         № 7. Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
         */

        task();

        for (int i = 8; i < 14; i++)
            if (i % 7 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Нет таких чисел!!!");
            }


        line();


        /**
         № 8. Распечатать последовательность которая начинается с минимального значения типа данных short
         и заканчивается максимальным значением short.
         Числа в последовательности должны быть кратны 15001.
         */

        task();

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++)
            if (i % 15001 == 0)
            System.out.println(i);

        line();

        /**
         № 9. Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
         Числа, кратные 11, должны быть распечатаны синим цветом.
         Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.
         */

        task();

        for(int i = -10; i < 35; i += 1)
            if(i % 11 == 0 && i !=0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0 && i !=0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            } else  if (i == 0) {
                System.out.println("ZERO");
            } else {
                System.out.println(i);
            }

        line();

        /**
         № 10. Написать метод, который принимает на вход параметры start,  end, step,
         и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
         Точка выхода из цикла - число end.
         */

        task();

        startEndStep(10, 15, 1);

        line();

        /**
         № 11. Написать метод, который принимает параметр l
         и печатает  последовательность четных чисел от нуля.
         Длина последовательности = l.
         */

        task();

        numbersL(17);

        line();



        /**
         № 12. Напишите метод,
         который принимает целое число n,
         и выводит все степени числа 2 от 1 до n включительно
         */

        task();

        numbersN(2);

        line();

        /**
         № 13. Вывести последовательность 012345678900112233445566778899000…
         до числа 9999 включительно.
         */

        task();

        System.out.println(thirteenth());

        line();

        /**
         № 14. Распечатайте последовательность чисел:
         0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */

        task();
        // первый вариант
        for (int i = 0, j = 1; i > -6 || j <= 5; i--, j++) {
            if (j < 6) {
                System.out.println(i + ", " + j + ", ");
            }
            System.out.println(i);
        }

        System.out.println("\n");

        line();

        // второй вариант
        System.out.println(0);
        for (int y = 1; y < 6; y++) {
            System.out.println("," + y + "," + (y * -1));
        }



        /**
         № 15. Распечатать последовательность чисел:
         0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */

        task();

        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 ==0) {
                System.out.println(i + ", ");
            }
        }

        line();

        /**
         № 16. Написать метод, который принимает параметры n, m,
         l, и печатает последовательность нечетных чисел начиная
         с числа n, с шагом m,  длина последовательности  l.
         */

        task();

        task16(5, 6, 2);

        line();

        task();

        /**
         № 17. Сгенерируйте и распечатайте последовательность
         по формуле: n + 1 = n + 2
         */

        seq17(3);




















    }

    }

