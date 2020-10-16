package lesson2;

import java.util.Arrays;

public class homeWork2 {
    public static void main(String[] args) {
//        lessonTwoOne();
//        lessonTwoTwo();
//        lessonTwoThree();
//        lessonTwoFour();
//        lessonTwoFive();
        System.out.println(lessonTwoSix(new int[]{1, 1, 1, 2, 1}));
//        lessonTwoSeven();
    }

    private static boolean lessonTwoSix(int arrSix[]) {
        int sum = 0;
        int sumLeft = 0;
        boolean result = false; // переменная нужна если в матрице несколько точек равенства
        for (int i = 0; i < arrSix.length; i++) {
            sum = sum + arrSix[i];
        }

        // Проверка суммы массива на четность
        if (sum % 2 != 0) {
            return false;
        }

        for (int i = 0; i < arrSix.length; i++) {
            sumLeft = sumLeft + arrSix[i];
            if (sumLeft == sum - sumLeft) {
                System.out.println(i);
                result = true;
            }
        }
        return result;
//        System.out.println(Arrays.toString(arrSix));
//        System.out.println("Сумма чисел массива " + sum);
    }

    private static void lessonTwoFive() {

        int[] arrFive = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minArr = arrFive[0];
        int maxArr = arrFive[0];
        for (int i = 0; i < arrFive.length; i++) {
            if (arrFive[i] < minArr) {
                minArr = arrFive[i];
            } else if (arrFive[i] > maxArr) {
                maxArr = arrFive[i];
            }

            // Класс Math
/*            minArr = Math.min(minArr, arrFive[i]);
            maxArr = Math.max(maxArr, arrFive[i]);*/

        }

        //Сортировка массива Класс Arrays

/*        Arrays.sort(arrFive);
        minArr = arrFive[0];
        maxArr = arrFive[arrFive.length - 1];*/

        System.out.printf("Минимальный элеммент массива %d максимальный %d", minArr, maxArr);
    }

    private static void lessonTwoFour() {

        final int SIZE = 9;

        int[][] deepArrayFour = new int[SIZE][SIZE];
        int lastIndex = SIZE - 1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j || i + j == SIZE - 1) { //i + j == SIZE - 1 нахождени элемента обратной диагонали?
                    deepArrayFour[i][j] = 1;
                }
            }
        }

        // Реализация с одним циклом

/*        for (int i = 0; i < SIZE; i++) {
            deepArrayFour [i][i] = deepArrayFour [i][lastIndex - i] = 1;
        }*/

        for (int[] ints : deepArrayFour) {
            System.out.println(Arrays.toString(ints));
        }

/*        for (int[] ints : deepArrayFour) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }*/
    }

    private static void lessonTwoThree() {

//        final int SIZE = 12;

        int[] arrThree = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // или arrThree[0] = 1 ... arrThree[12] = 1
        System.out.println(Arrays.toString(arrThree));

        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }

            // Тернарный оператор в таком случае 50/50

//            arrThree[i] *= (arrThree[i] < 6) ? 2 : 1;
        }
        System.out.println(Arrays.toString(arrThree));

    }

 /*   private static void lessonTwoThree() {

        final int SIZE = 3;

        int[][] deepArray = new int[SIZE][SIZE];
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                deepArray[i][j] = num++;
            }
        }

        for (int[] ints : deepArray) {
            for (int anInt : ints) {
//                System.out.print(anInt + " ");
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }
    }*/

    public static void lessonTwoTwo() {

        final int SIZE = 8;

        int[] arrTwo = new int[SIZE];

        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i * 3;
//           System.out.print(arrTwo[i] + " ");
        }

        System.out.println(Arrays.toString(arrTwo));

    }

    public static void lessonTwoOne() {

        final int SIZE = 10;

        int[] arr = new int[SIZE];

        arr[0] = 1;
        arr[1] = 1;
        arr[4] = 1;
        arr[6] = 1;
        arr[7] = 1;

        System.out.println("Начальный массив");

/*        for (int i : arr) {
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.toString(arr));

        System.out.println("Конечный массив");

        for (int i = 0; i < arr.length; i++) {
            /*if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;*/
//            System.out.print(arr[i] + " ");

            // if else с помощью тернарного оператора

            arr[i] = (arr[i] == 0) ? 1 : 0;
        }

        System.out.println(Arrays.toString(arr));

    }


}

