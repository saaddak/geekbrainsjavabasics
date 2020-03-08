package ru.geekbrains.lessontwo;

class Squirting {
    static int[][] squirtArrayFilling(int arrayDimension) {
        int[][] resultArray = new int[arrayDimension][arrayDimension];
        for(int i = 0; i < resultArray.length; i++) {
            for(int j = 0; j < resultArray[i].length; j++) {
                if(i == j || (arrayDimension - i) == j + 1) {
                    resultArray[i][j] = resultArray[i][arrayDimension - i - 1] = 1;
                }
                else {
                    resultArray[i][j] = 0;
                }
            }
        }
        return resultArray;
    }
}
