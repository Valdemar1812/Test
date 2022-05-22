package homework;

import java.sql.Array;
import java.util.Arrays;

public class HW7 {

    static int n = 1;

    public static void task() {

        System.out.println("\u001B[35m ******\u001B[33m Task \u001B[0m \u001B[36m №  " + n + "\u001B[0m" + "\u001B[35m ****** \u001B[0m");
        n++;
    }

    public static void line() {
        System.out.println("________________________________________");
    }

    public static void main(String[] args) {



        /**
         № 1. Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
         */

        task();

        String[] catsNames = new String[8];
        catsNames[0] = "Черныш";
        catsNames[1] = "Мурка";
        catsNames[2] = "Чак";
        catsNames[3] = "Рыжик";
        catsNames[4] = "Пушок";
        catsNames[5] = "Васёк";
        catsNames[6] = "Алиса";
        catsNames[7] = "Машка";

        for (int i = 0; i < 8; i++) {
            System.out.println(catsNames[i]);
        }

        line();

        task();

        /**
         # 2. В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        а значение элемента с индексом 1 на “Черныш”.
         */

        catsNames[4] = "Рыжик";

        catsNames[1] = "Черныш";

        System.out.println(catsNames[4]);
        System.out.println(catsNames[1]);

        line();

        task();

        /**
        № 3. Создать массив catsColors и заполнить его значениями.
        */

        String[] catsColor = new String[8];
        catsColor[0] = "черный";
        catsColor[1] = "белый";
        catsColor[2] = "серый";
        catsColor[3] = "рыжий";
        catsColor[4] = "пурпурный";
        catsColor[5] = "белый";
        catsColor[6] = "цвета коньяка";
        catsColor[7] = "разноцветный";

        for (int i = 0; i < 8; i++) {
            System.out.println(catsColor[i]);
        }

        line();

        /**
        № 4. Создать массив catsAges и заполнить его любыми значениями.
        */

        task();

        int[] catsAge = {2, 3, 4, 5, 1, 6, 1, 8};

        for (int i = 0; i < 8; i++) {
            if (i == 1) {
                System.out.println(catsAge[i] + " год");
            } else if (i > 1 && i < 5) {
                System.out.println(catsAge[i] + " года");
            } else if (i > 4) {
                System.out.println(catsAge[i] + " лет");
                }
            }

        line();

        task();

        /**
         № 5. Создать массив isCatRed
         и заполнить его соответствующими значениями
         */

        boolean[] isCatRed = new boolean[catsColor.length];
        for(int i = 0; i < catsColor.length; i++) {
            if (catsColor[i].equals("рыжий")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
        }

        System.out.println(isCatRed[3]);

        line();

        task();

    /**
    № 6. Распечатать для массивов catsNames и catsColors:
    имя кота в коробке с номером 6
    имена котов из коробок с четными индексами
    имена котов из коробок, чьи индексы кратны 4
    цвет котов из коробок с нечетными индексами
    цвет котов из коробок, чьи индексы кратны 3
    */

        System.out.println(catsNames[6]);

        // второй вариант
        int catsNameLength = catsNames.length;

        for (int i = 0; i < catsNames.length; i++) {
            if (i == 6) {
                System.out.println(catsNames[i]);
            }
        }

        line();

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ") " + catsNames[i] + " - кот из четной коробки");
            }
        }

        line();

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i] + " - кот из коробки кратной 4");
            }
        }

        line();

        for (int i = 0; i < catsColor.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColor[i] + " - кот из коробки с нечетным индексом");
            }
        }

        line();

        for (int i = 0; i < catsColor.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColor[i] + " - кот из коробки кратной трем");
            }
        }

        line();

        task();

        /**
         № 7. Распечатать “Накорми кота!” для всех серых котов
         */

        for (int i = 0; i < catsColor.length; i++) {
            if (catsColor[i].equals("серый")) {
                System.out.println(catsNames[i] + " - это серый кот, накорми этого кота!!!");
            }
        }

        line();

        task();

        /**
         № 8. Распечатать
         “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
         */

        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] < 0) {
                System.out.println("Ваш котик еще не родился");
            } else if (catsAge[i] >=  0 && catsAge[i] < 2) {
                System.out.println("Отнеси кота " + catsAge[i] + " на прививку");
            }
        }

        line();

        task();

        /**
         № 9. Для кота в последней коробке распечатать имя, цвет, возраст
         */

        if (catsNames.length == catsColor.length && catsAge.length == catsColor.length && catsNames.length !=0) {

            System.out.println("Имя кота - " + catsNames[catsNames.length - 1]);
            System.out.println("Цвет кота - " + catsColor[catsColor.length - 1]);
            System.out.println("Возраст кота - " + catsAge[catsAge.length - 1]);
        }

        line();

        task();

        /**
        № 10. Распечатать имена всех котов, чей возраст больше 2 лет
         */

        if (catsNames.length == catsAge.length && catsNames.length != 0) {

            for (int i = 0; i < catsAge.length; i++) {
                if (catsAge[i] > 2) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        line();

        task();

        /**
         № 11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
         */

        if (catsNames.length == isCatRed.length && isCatRed.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i]) {
                    System.out.println("Накорми кота!");
                } else {
                    System.out.println("Не стоит его кормить");
                }
            }
        }

        line();

        task();

        /**
         № 12. Распечатать средний возраст котов из массива catsAges
         */

        double sum = 0;
        for (int i = 0; i < catsAge.length; i++) {
            sum = sum + catsAge[i];
            System.out.println(sum / catsAge.length);
        }
        line();

        task();

        /**
         № 13. Распечатать возраст самого молодого кота
         */

        double min = catsAge[0];
        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] < min) {
                min = catsAge[i];
            }
        }

        System.out.println("Возраст самого молодого кота = " + min);

        line();

        task();

        /**
         № 14. Распечатать возраст самого старого кота
         */

        int max = catsAge[0];
        for (int i = 0; i < catsAge.length; i++) {
            if (catsAge[i] > max) {
                max = catsAge[i];
            }
        }

        System.out.println("Возраст самого старого кота = " + max);

        line();

        task();

        /**
         № 15. Распечатать количество серых котов
         */

        int greyCAt = 0;
        for (int i = 0; i < catsColor.length; i++) {
            if (catsColor[i].equals("серый")) {
                greyCAt++;
            }
        }

        System.out.println("Количество серых котов - " + greyCAt);

        line();

        task();

        /**
         № 16. Распечатать имя кота,
         если кот находится в коробке
         с четным индексом и его возраст не больше 3 лет
         */

        if (catsAge.length == catsNames.length && catsNames.length != 0) {
            for (int i = 0; i < catsAge.length; i++) {
                if (i % 2 == 0 && catsAge[i] < 3) {
                    if (catsAge[i] == 1) {
                        System.out.println("Кот " + catsNames[i]
                                + ", его индекс [" + i + "], его возраст " + catsAge[i] + " год");
                    } else {
                        System.out.println("Кот " + catsNames[i]
                                + ", его индекс [" + i + "], его возраст " + catsAge[i] + " года");
                    }
                }
            }
        }

        line();

        task();

        /**
         № 17. Создать массив четных положительных чисел,
         значения которых не больше 10. (заполняем значения с помощью цикла for)
         */



        int count1 = 0;
        for (int j = 0; j < 11; j++) {
            if (j % 2 == 0) {
                count1 = count1 + 1;
            }
        }
        int[] numberTask17 = new int[count1];

        int number = 0;
        for (int i = 0; i < 11; i++) {

            if(i > 0 && i % 2 == 0 && i < numberTask17.length) {

                numberTask17[i] = i;
            }

        } System.out.println(Arrays.toString(numberTask17));










    }
}
