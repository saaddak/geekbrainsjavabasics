package ru.geekbrains.lessontwo;

class TotalExtreme {
    static int arrayMin(int[] targetArr) {
        int minimum = targetArr[0];
        for(int i = 0; i < targetArr.length; i++) {
            if(targetArr[i] < minimum) { minimum = targetArr[i]; }
        }
        return minimum;
    }
    static int arrayMax(int[] targetArr) {
        int maximum = targetArr[0];
        for(int i = 0; i < targetArr.length; i++) {
            if(targetArr[i] > maximum) { maximum = targetArr[i]; }
        }
        return maximum;
    }
}
