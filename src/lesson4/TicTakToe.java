package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {

    static final int SIZE = 3;
    static final int DOT_SIZE_TO_WIN = 3;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';

    static final String HEADER_FIRST_EMPTY = "#";
    static final String EMPTY = " ";

    static char[][] map = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapRow();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }


    private static void playGame() {

        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rowNumber;
        int colNumber;
        System.out.println("\nХод человека! Введите номер строки и столбца");

        do {
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Столбец = ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_HUMAN;
    }

    private static boolean isCellValid(int rowNumber, int colNumber, boolean isAI) {

        if (!isAI && ((rowNumber < 1) || (rowNumber > SIZE) || (colNumber < 1) || (colNumber > SIZE))) {
            System.out.println("\nпроверьте значение строки и стлбца");
            return false;
        }

        if ((map[rowNumber - 1][colNumber - 1]) != DOT_EMPTY) {
            if (!isAI) {
                System.out.println("\nВы выбрали занятую ячейку");
            }
            return false;
        }

        return true;
    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        return isCellValid(rowNumber, colNumber, false);
    }


    private static void checkEnd(char symbol) {

        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;

            if (symbol == DOT_HUMAN) {
                winMessage = "УРА! Вы победили!";
            } else {
                winMessage = "Восстание близко! AI победил";
            }

            isEnd = true;
            System.out.println(winMessage);

        }

        if (!isEnd && isMapFull()) {
            System.out.println("Ничья!");
            isEnd = true;
        }


        if (isEnd) {
            turnAgain();
            System.exit(0);
        }
    }

    private static void turnAgain() {
        String[] yesAnswer = new String[]{"yes", "1", "да", "конечно", "y"};
        System.out.println("\nХотите сыграть еще раз. Да, Нет");
        String userAnswer = scanner.next();
        userAnswer = userAnswer.toLowerCase();
        for (int i = 0; i < yesAnswer.length; i++) {
            if ((userAnswer.equals(yesAnswer[i]))) {
                turnGame();
            }
        }
    }

    private static boolean checkWin(char symbol) {
        if (checkRow(symbol)) return true;
        if (checkCol(symbol)) return true;
//        if (chekDiagonal(rowNumber, colNumber, symbol)) return true;
        //checkInvertDiagonal

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

        return false;
    }

    private static boolean checkRow(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int winCharsCount = 0;
            for (int j = 0; j < SIZE; j++) {

                if (map[i][j] == symbol) {
                    winCharsCount += 1;
                }
            if (winCharsCount == SIZE) {
                return true;
            }
            }
        }
        return false;
    }

    private static boolean checkCol(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int winCharsCount = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symbol) {
                    winCharsCount += 1;
                }
            if (winCharsCount == SIZE) {
                return true;
            }
            }
        }
        return false;
    }

    private static boolean chekDiagonal(int rowNumber, int colNumber, char symbol) {
        int winCharsCount = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                winCharsCount += 1;
            }
        }
        if (winCharsCount == SIZE) {
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
        int rowNumber;
        int colNumber;
        System.out.println("\nХод компьютера!");

        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber, true));

        map[rowNumber - 1][colNumber - 1] = DOT_AI;
    }

}
