package lesson1;

public class Main {

    public static void main(String[] args) {
//      printHelloWorld();

        lessonOneExTwo();
        lessonOneExThree(4.0, 5.0, 6.0,7.0);
        lessonOneExFour(5, 15);
        lessonOneExFive(-13);
        lessonOneExSix(-18);
        lessonOneExSeven("Александр");
        lessonOneExEight(1974);


    }

    public static void printHelloWorld() {
        System.out.println("Hello, world!");
    }

    public static void lessonOneExTwo() {
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

    public static void lessonOneExThree(double a, double b, double c, double d) {
//        double a = 4.0;
//        double b = 5.0;
//        double c = 6.0;
//        double d = 7.0;
        double result = a * (b + (c / d));
        System.out.println(result);
    }

    public static boolean lessonOneExFour(int firstNumber, int twoNumber) {
        int result = firstNumber + twoNumber;
        if (result >= 10 && result <= 20){
//            System.out.println("true");
            return true;
        }
        return false;
    }

    public static void lessonOneExFive(int number) {
        if (number >= 0) System.out.println(number + " - число положительное.");
        else System.out.println(number + " - число отрицательное.");
    }

    public static boolean lessonOneExSix(int number) {
        if (number < 0) {
//            System.out.println("true");
            return true;
        }
        return false;
    }

    static void lessonOneExSeven(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void lessonOneExEight(int year) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
            System.out.println(year + " год високосный.");
        }
        System.out.println(year + " год не является високосным.");

    }



}
