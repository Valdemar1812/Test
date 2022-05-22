package homework;

import javax.sql.rowset.spi.SyncFactory;

public class HW2 {
    public static void main(String[] args) {

        /** задания с 11 по 16
         */

        int k = 6;
        int l = 10;
        int m = 130;

        String line = "____________________________";
        String znak = ";";
        System.out.println("<<<<<Задания с 11 по 16>>>>>");

        System.out.println(k + znak);
        System.out.println(l + znak);
        System.out.println(m + znak);

        System.out.println(k + ", " + l + ", " + m);

        System.out.println("k =   " + k);
        System.out.println("l =  " + l);
        System.out.println("m = " + m);

        int sumKL = k + l;
        int km = k * m;
        int difLM = l - m;
        String sumPhrase = "Sum of " + k + " and " + l + " = " + sumKL;
        String kM = "k * m = " + km;
        String difPhrase = "Разность переменных " + l + " и " + m + " = " + difLM;

        System.out.println(sumPhrase);
        System.out.println(kM);
        System.out.println(difPhrase);

        System.out.println(line);

        /** задание 17
         */
        System.out.println("<<<<<Задание № 17>>>>>");

        int divadeKL = k / l;
        int divadeKM = k / m;
        int divadeLM = l / m;
        int divadeMK = m / k;

        int ostatokKL = k % l;
        int ostatokKM = k % m;
        int ostatokLM = l % m;
        int ostatokMK = m % k;

        String resultsKL = "Результат деления " + k + " на " + l + " = " + divadeKL + ", а остаток от деления = "
        + ostatokKL;
        String resultsKM = "Результат деления " + k + " на " + m + " = " + divadeKM + ", а остаток от деления = "
        + ostatokKM;
        String resultsLM = "Результат деления " + l + " на " + m + " = " + divadeLM + ", а остаток от деления = "
        + ostatokLM;
        String resultsMK = "Результат деления " + m + " на " + k + " = " + divadeMK + ", а остаток от деления = "
        + ostatokMK;

        System.out.println(resultsKL);
        System.out.println(resultsKM);
        System.out.println(resultsLM);
        System.out.println(resultsMK);

        System.out.println(line);

        /**задание 18
         */
        System.out.println("<<<<<Задание № 18>>>>>");

        int apple = 40;
        apple = 100;
        int student = 6;
        student = 21;

        int divAppleStudent = apple / student;
        int ostatokAppleStudent = apple % student;

        String phrase = "Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
        + divAppleStudent + " яблок(а) и " + ostatokAppleStudent + " яблок(а) останется учителю.";

        System.out.println(phrase);

        System.out.println(line);

        /**Задание 19
         */
        System.out.println("<<<<<Задание № 19>>>>>");

        int  sumKlmPlus = k + l + m + 1;
        int sumKLM = k + l + m - 1;
        int result = sumKlmPlus + sumKLM;
        int mPlus = m + 1;
        int sumLKM = l + k + m;
        int result2 = mPlus - sumLKM;

        String phrase1 = "Сумма чисел " + sumKlmPlus + " и " + sumKLM + " = " + result + ", а разность " + mPlus + " и "
        + sumLKM + " = " + result2;

        System.out.println(phrase1);

        System.out.println(line);

        /** Задание 20
         */
        System.out.println("<<<<<Задание № 20>>>>>");


        System.out.println(48 % 8);
        System.out.println(48 % 2 == 0);
        System.out.println(8 % 2 == 0);
        System.out.println(47 % 2 != 0);
        System.out.println(49 % 2 != 0);

          System.out.println(line);
//
//
        /** Задание 21
         */

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        String line1 =  "|''''''''|''''''''| ";
        String line2 = "|________|________| ";

        System.out.println("<<<<<Задание № 20>>>>>");

        int result21 = (x + 3) * (x +3);
        //int result22 = ((3 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c) / x) + 9 * (4 / x + (9 + x) / y);

        //System.out.println(result22);

        System.out.println(line1);
        System.out.println("|task    | result |");
        System.out.println(line1);
        System.out.println("|   21   |" + result21 + "      |" );
        System.out.println(line1);
       // System.out.println(("|   22   |" + result22 + "      |" );

























    }
}
