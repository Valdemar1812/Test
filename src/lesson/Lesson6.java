package lesson;

public class Lesson6 {
    static int n = 1;

    public static void task() {

        System.out.println("\u001B[35m ******\u001B[33m Task \u001B[0m \u001B[36m №  " + n + "\u001B[0m" + "\u001B[35m ****** \u001B[0m");
        n++;
    }

    public static void line() {
        System.out.println("________________________________________");
    }


    // ЦИКЛЫ
    public static void main(String[] args) {

        task();
        // печатаем Java for boginners для всех чисел от 1 до 5
//        for (int i = 1; i < 6; i++) {
//            System.out.println("Java for boginners"); //  ava for boginners
//        }

        line();

        task();

        for (int i = 1; i < 6; i++) {
            System.out.println(i); // напечатали 1 2 3 4 5 в столбик
        }

        task();

        // печатаем нечетные чилса от 1 до 10 включительно 1 метод

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        };

        task();

        // печатаем нечетные чилса от 1 до 10 включительно 2 метод

        for (int i = 1; i < 11; i = i + 2) {
            System.out.println(i);
            }

        line();

        task();

        // печатаем нечетные чилса от 1 до 10 включительно 3 метод

        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
        }

        line();

        task();

        // печатаем все числа от 1 до 100 включительно с шагом 10

        for (int i = 1; i < 101; i += 10) {
            System.out.println(i);

        }

        task();

        // печатаем все числа в промежутке от 0 до 100 включительно, которые делятся на 10

        for (int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }

        line();

        task();
        // печатаем числа от - 100 до 100, только кратные 10

        for (int i = -100; i < 101; i += 10) {
            System.out.println(i);
        }

        line();

        task();

        // Печатаем все числа от 5 до 1 на уменьшение
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        line();

    }
}
