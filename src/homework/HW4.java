package homework;

import java.sql.SQLOutput;

public class HW4 {

    static int n = 3;

    public static void task() {

        System.out.println("\u001B[31m Task № " + n);
        n++;
    }

    public static void line() {
        System.out.println("\u001B[31m ---------------------------");
    }

    public static void main(String[] args) {
        /**
         Задание № 3. Записать в виде кода следующие логические выражения:
         1) (2 = 2) И (7 = 7);
         2) Не(15 < 3);
         3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         4) Не("Сосна" = "Дуб");
         5) (Не(15 < 3)) И (10 > 20);
         6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
         7) (6/2 = 3) ИЛИ (7*5 = 20).
         */

        task();

        System.out.println((2 == 2) && (7 == 7));
        System.out.println(!(15 < 3));

        String a = "Сосна";
        String b = "Дуб";
        String c = "Вишня";
        String d = "Клён";

        System.out.println((a.equals(b) || (c.equals(d))));

        System.out.println(!(a.equals(b)));

        System.out.println("5) " + (!(15 < 3) && (10 > 20))); // (Не(15 < 3)) И (10 > 20);

        String e = "\"Глаза даны, чтобы видеть\" ";
        String f = "\"Под третьим этажом находится второй этаж\"";
        System.out.println();  // ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж")


        line();

        //

        /**
         Задание № 4. Записать в виде кода:
         1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
         2) !(28 > 7) И !(300/5 = 60);
         3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
         4) Не((300 < 100))  → ("Жажду можно утолить водой");
         5) (75 < 81) → (88 = 88).
         */
        task();
        line();

        String frasa1 = "В минуте 70 секунд";
        String frasa2 = "Работающие часы показывают время";

        /**
         Задание № 5. Записать в виде кода следующие выражения:
         а) Андрей старше Светы. Наташа старше Светы.
         б) На полке стоят учебники, а на столе лежат справочники.
         в) БОльшая часть детей — девочки. Остальные - мальчики.

         */








    }
}


//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
