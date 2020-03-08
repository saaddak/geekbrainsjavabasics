package ru.geekbrains.lessontwo;

import java.util.Arrays;
import static ru.geekbrains.lessontwo.ArrayPrintingTool.printArray;
import static ru.geekbrains.lessontwo.Invertor.arrayReverse;
import static ru.geekbrains.lessontwo.Fulfiller.arrayFulfill;
import static ru.geekbrains.lessontwo.TotalExtreme.arrayMin;
import static ru.geekbrains.lessontwo.TotalExtreme.arrayMax;
import static ru.geekbrains.lessontwo.Multiplier.arrayMultiP;
import static ru.geekbrains.lessontwo.Squirting.squirtArrayFilling;
import static ru.geekbrains.lessontwo.DownShifter.mortgageLoan;

public class LessonTwoApe {
    public static void main(String[] args) {
        int[] intyArr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Перевёртыватель массива: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]\n" + "arrayReverse:            " + Arrays.toString(arrayReverse(intyArr)) + "\n");

        int[] intyDummy = new int[8];
        System.out.println("Заполневатель массива значениями: [1, 4, 7, 10, 13, 16, 19, 22]\nФормула: An = 3n - 2\n" + "arrayFulfill:                     " + Arrays.toString(arrayFulfill(intyDummy)) + "\n");

        int[] variousArr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Умножатель массива: [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]\n" + "arrayMultiP:        " + Arrays.toString(arrayMultiP(variousArr)) + "\n");

        int[] onedimensionalArr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Искатетель минимального элемента массива: [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]\n" + "arrayMin: " + arrayMin(onedimensionalArr));
        System.out.println("Искатетель максимального элемента массива: [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]\n" + "arrayMax: " + arrayMax(onedimensionalArr) + "\n");

        int arrayDimension = 5;
        int[][] squirtingArray = squirtArrayFilling(arrayDimension);
        System.out.println("Заполнитель диагоналей массива 5 на 5:");
        printArray(squirtingArray);
        System.out.println();

        int[] bloomingYouth = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] anotherBloomingYouth = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] wastedYouth = mortgageLoan(2, bloomingYouth);
        int[] anotherWastedYouth = mortgageLoan(-3, anotherBloomingYouth);
        System.out.println("Сдвиг массива bloomingYouth на 2 позиции вправо: ");
        printArray(wastedYouth);
        System.out.println("Сдвиг массива anotherBloomingYouth на 3 позиции влево: ");
        printArray(anotherWastedYouth);
        System.out.println();
    }
}
