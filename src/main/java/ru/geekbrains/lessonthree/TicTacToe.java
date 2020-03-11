package ru.geekbrains.lessonthree;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';
    private static final boolean SILLY_MODE = false;

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        boolean uglySwitcher = true;
        boolean disgustingSwitcher = true;
        while (uglySwitcher) {
            playOneRound();
            System.out.println("Продлевать будете (Д/Н)?");
            String answer = "";
            do {
                answer = SCANNER.next();
                switch (answer) {
                    case "Д":
                    case "Да":
                    case "д":
                    case "дa":
                    case "Y":
                    case "Yes":
                    case "y":
                    case "yes":
                    case "А можно всех посмотреть?":
                        uglySwitcher = true;
                        disgustingSwitcher = false;
                        break;
                    case "Н":
                    case "Нет":
                    case "н":
                    case "нет":
                    case "N":
                    case "No":
                    case "n":
                    case "no":
                        uglySwitcher = false;
                        disgustingSwitcher = false;
                        break;
                    default:
                        System.out.println("Требуется ответить: да (Д) или нет (Н)?");
                        disgustingSwitcher = true;
                }
            } while(disgustingSwitcher);
        }
    }

    // printField - заполнение поля
    private static void printField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }
        System.out.println("------");
    }

    // initField - инициализация поля
    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    // isValidCell - проверка попадания в поле
    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >=0 && y < fieldSizeY;
    }

    // isEmptyCell - проверка заполненности ячейки
    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    // humanTurn - ход человека
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода X и Y (от 1 до 3) через пробел [строка столбец] >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        System.out.println("Человек выбрал ячейку: строка " + (x + 1) + ", столбец " + (y + 1));
        field[y][x] = DOT_HUMAN;
    }

    // aiTurn - ход компьютера
    private static void aiTurn() {
        /*int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while(!isEmptyCell(x, y));
        field[y][x] = DOT_AI;*/

        int x = -1;
        int y = -1;
        int[] xyIsxy = new int[2];
        if (SILLY_MODE) {
            randyCoordinates(xyIsxy);
            y = xyIsxy[0];
            x = xyIsxy[1];
        } else {
            for (int i = 0; i < fieldSizeY; i++) {
                for (int j = 0; j < fieldSizeX; j++) {
                    if(isEmptyCell(j, i)) {
                        if (WinPathChecker(DOT_HUMAN)) {
                            x = j;
                            y = i;
                        } else if (WinPathChecker(DOT_AI)) {
                            x = j;
                            y = i;
                        } else {
                            randyCoordinates(xyIsxy);
                            y = xyIsxy[0];
                            x = xyIsxy[1];
                        }
                    }
                }
            }
        }
        System.out.println("Компьютер выбрал ячейку: строка " + (x + 1) + ", столбец " + (y + 1));
        field[y][x] = DOT_AI;
    }

    private static boolean WinPathChecker(char playerDOT) {
        for (int i = 0; i < fieldSizeX; i++) {
            if (LineChecker(i, 0, 0, 1, playerDOT)) {
                return true;
            }
            if (LineChecker(0, i, 1, 0, playerDOT)) {
                return true;
            }
        }
        if (LineChecker(0,0,1,1, playerDOT)) {
            return true;
        }
        if (LineChecker(0,fieldSizeX - 1,1,-1, playerDOT)) {
            return true;
        }
        return false;
    }

    private static boolean LineChecker(int startX, int startY, int deltaX, int deltaY, char playerDOT) {
        for (int i = 0; i < fieldSizeX; i++) {
            if (field[startX + i * deltaX][startY + i * deltaY] != playerDOT) {
                return false;
            }
        }
        return true;
    }

    // isFieldFull - проверка заполненности поля
    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) {return false;}
            }
        }
        return true;
    }

    // checkWin(char dot) - проверка победы
    private static boolean checkWin(char c) {
        return checkDiagonals(c) || checkLines(c);

        /*boolean result = true;
        if (
            (field[0][0] == c && field[0][1] == c && field[0][2] == c) ||
            (field[1][0] == c && field[1][1] == c && field[1][2] == c) ||
            (field[2][0] == c && field[2][1] == c && field[2][2] == c) ||
            (field[0][0] == c && field[1][0] == c && field[2][0] == c) ||
            (field[0][1] == c && field[1][1] == c && field[2][1] == c) ||
            (field[0][2] == c && field[1][2] == c && field[2][2] == c) ||
            (field[0][0] == c && field[1][1] == c && field[2][2] == c) ||
            (field[2][0] == c && field[1][1] == c && field[0][2] == c) ) {
            result = true;
        }
        return result;*/
    }

    private static boolean checkDiagonals(char playerSign) {
        boolean rightDiagonal, leftDiagonal;
        rightDiagonal = leftDiagonal = true;
        for (int y = 0; y < fieldSizeY; y++) {
            rightDiagonal &= (field[y][y] == playerSign);
            leftDiagonal &= (field[(fieldSizeX - y - 1)][y] == playerSign);
        }
        return rightDiagonal || leftDiagonal;
    }

    private static boolean checkLines(char playerSign) {
        boolean columns, rows;
        for (int y = 0; y < fieldSizeY; y++) {
            columns = true;
            rows = true;
            for (int x = 0; x < fieldSizeX; x++) {
                columns &= (field[y][x] == playerSign);
                rows &= (field[x][y] == playerSign);
            }
            if (columns || rows) {return true;}
        }
        return false;
    }



    private static void playOneRound() {
        initField();
        printField();
        while (true) {
            humanTurn();
            if (isEndGame(DOT_HUMAN)) {
                break;
            }
            aiTurn();
            if (isEndGame(DOT_AI)) {
                break;
            }
        }

        /*while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл кожаный ублюдок!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {

                System.out.println("checkWin(DOT_AI)");

                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }*/
    }

    private static boolean isEndGame(char playerSymbol) {
        printField();
        if (checkWin(playerSymbol)) {
            if(playerSymbol == 'X') {
                System.out.println("Победил кожаный ублюдок!");
            } else {
                System.out.println("Победил компьютер!");
            }
            return true;
        }
        if (isFieldFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static void randyCoordinates(int[] xyIsxy) {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        xyIsxy[0] = y;
        xyIsxy[1] = x;
    }
}
