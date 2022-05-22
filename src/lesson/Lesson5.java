package lesson;

public class Lesson5 {

    // метод - ищем минимальное число
    public static  int returnMinOfThree(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {
            min = c;

            return min;
        }

    }

    // метод - ищем среднее число
    public  static double average (int a, int b, int c) {

        return ((double) a + b + c) / 3;  // один из параметров перевили в дабл и все автоматически перевелось в double

    }

    public static double returnAbs (double number) {
        if (number < 0) {
            number = (-1) / number;
        }

        return number;
    }

    // ищем разницу между мин и средним числами
    public static double countDifferenceMinAndAvergage(int a, int b, int c) {
        int min = returnMinOfThree (a, b, c);
        double average = average(a, b, c);

        double difference = min - average;

        if (difference < 0) {
            difference = (-1) * difference;  // проверяем если вдруг разница будет меньше 0
        }

        return difference;
    }

    public static String displayMessage (int a, int b, int c) {

        String message;
        if (countDifferenceMinAndAvergage(a, b, c) > 3.51) {
            message = "Большой разброс чисел";
            //System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
            // System.out.println(message);
        }

        return message;
    }

    public static void main(String[] args) {

// Даны 3 числа.
// Необходимо найти максимально точную разницу
// между минимальным числом и средним значением.
// Если разница больше 3.51,
// показать пользователю сообщение "Большой разброс чисел",
// иначе показать сообщение "Маленький разброс чисел"

        int a = 5;
        int b = 2;
        int c = 10;

        System.out.println(returnMinOfThree(5, 2, 10));

        System.out.println(average(a, b, c));

        System.out.println(displayMessage(a, b, c));

    }
}
