package ru.geekbrains.lessontwo;

class Invertor {
    static int[] arrayReverse(int[] targetArr) {
        for(int i = 0; i < targetArr.length; i++) {
            targetArr[i] = ((targetArr[i] == 1) ?  0 : 1);
        }
        return targetArr;
    }
}
