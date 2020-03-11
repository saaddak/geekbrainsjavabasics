package ru.geekbrains.lessontwo;

class Multiplier {
    static int[] arrayMultiP(int[] targetArr) {
        for(int i = 0; i < targetArr.length; i++) {
            if(targetArr[i] < 6) { targetArr[i] *= 2; }
        }
        return targetArr;
    }
}
