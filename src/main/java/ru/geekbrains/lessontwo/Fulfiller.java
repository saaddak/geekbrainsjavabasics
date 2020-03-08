package ru.geekbrains.lessontwo;

class Fulfiller {
    static int[] arrayFulfill(int[] targetArr) {
        for(int i = 0; i < targetArr.length; i++) {
            targetArr[i] = (3 * (i + 1)) - 2;
        }
        return targetArr;
    }
}
