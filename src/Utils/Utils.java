package Utils;

public class Utils {

    public static void line() {
        System.out.println("_______________________");
    }

    public static void ln() {
        System.out.println();
    }



        public static void task(int number) {
            ln();
            line();
            System.out.println("\u001B[35m ******\u001B[33m Task \u001B[0m \u001B[36m №  " + number + "\u001B[0m" + "\u001B[35m ****** \u001B[0m");
        }



    public static String verifyInt(int a, int b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else  {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public static String verifyInt(String a, String b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else  {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public static String verifyInt(double a, double b) {
        if (a == b) {
            System.out.println("Pass");

            return "Pass";
        } else  {
            System.out.println("Fail");

            return "Fail";
        }
    }

//    метод, который принимает
//    на вход массив целых положительных чисел,
//    и возвращает количество четных чисел в этом массиве
//     */

    public static int counEvenElements(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }

        }

        return count;

    }

}
