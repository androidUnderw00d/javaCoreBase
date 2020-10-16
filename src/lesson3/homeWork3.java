package lesson3;

import java.util.Scanner;

public class homeWork3 {


    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число.\n");
        guessNumber(10);
    }

    private static void reStart() {
        System.out.println("\nПовторить игру еще раз? 1 – да / 0 – нет\n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1){
            guessNumber(10);
        }
    }

    private static void guessNumber(int range) {
        int number = (int)(Math.random() * range);
        for (int i = 0; i < 3; i++) {
            System.out.println("угадайте число от 0 до " + range);
            Scanner scanner = new Scanner(System.in);
            int inputNumber = scanner.nextInt();
            if(inputNumber == number){
                System.out.println("Вы угадали.");
                break;
            } else if(inputNumber > number){
                System.out.println("Загаданое число меньше");
            } else {
                System.out.println("Загаданое число больше.");
            }
        }
        reStart();
    }
}