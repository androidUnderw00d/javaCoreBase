package lesson1;

public class Main {

    public static void main(String[] args) {
//      printHelloWorld();

//        lessonOneTwo();
//        lessonOneThree(4.0, 5.0, 6.0,7.0);
//        lessonOneFour(5, 15);
//        lessonOneFive(-13);
        lessonOneSix(-18);
//        lessonOneSeven("Александр");
//        lessonOneEight(400);


    }

    public static void printHelloWorld() {
        System.out.println("Hello, world!");
    }

    public static void lessonOneTwo() {
        byte valByte = 3;
        short valShort = 12345;
        int valInt = 7;
        long valLong = 500000L;
        float valFloat = 12.34f;
        double valDouble = -123.456;
        char valChar = '*';
        boolean valBoolean = false;
//        System.out.println(valByte);
//        System.out.println(valShort);
//        System.out.println(valInt);
//        System.out.println(valLong);
//        System.out.println(valFloat);
//        System.out.println(valDouble);
//        System.out.println(valChar);
//        System.out.println(valBoolean);
    }

    public static void lessonOneThree(double a, double b, double c, double d) {
/*        if (d == 0){
            System.out.println("На ноль делить нельзя!");
            return 0;
        }
        return a * (b + (c / d));*/ // вариант преподователя
        double result = a * (b + (c / d));
        System.out.println(result);
    }

    public static boolean lessonOneFour(int firstNumber, int twoNumber) {
        int result = firstNumber + twoNumber;
        if (result >= 10 && result <= 20) {
            System.out.println("true");
//            return true;
        }
        return false;
    }

    public static void lessonOneFive(int number) {
        // решение с помощью тернарного оператора

        String word = (number >= 0) ? "положительное." : "отрицательное.";
        System.out.println(number + " - число " + word);
//        System.out.printf("%d - число %s%n", number, word); //форматированный вывод

//        решение с if
/*        if (number >= 0) {
            System.out.println(number + " - число положительное.");
        }
        System.out.println(number + " - число отрицательное.");*/

    }

    public static boolean lessonOneSix(int number) {
//        return number < 0; // самый короткий код
        if (number < 0) {
//            System.out.println("true");
            return true;
        }
        return false;
    }

    static void lessonOneSeven(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void lessonOneExEight(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год високосный.");
        } else System.out.println(year + " год не является високосным.");

    }


}
