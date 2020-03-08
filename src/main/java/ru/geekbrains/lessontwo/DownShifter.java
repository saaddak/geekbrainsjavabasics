package ru.geekbrains.lessontwo;

import static java.lang.Math.abs;

class DownShifter {
    static int[] mortgageLoan(int lostYears, int[] wastedYouth) {
        if(abs(lostYears) > wastedYouth.length) {
            for (int i = 0; i < wastedYouth.length; i++) {
                wastedYouth[i] = 0;
            }
            return wastedYouth;
        } else {
            if (lostYears > 0) {
                for (int i = (wastedYouth.length - 1); i >= lostYears; i--) {
                    wastedYouth[i] = wastedYouth[i - lostYears];
                }
                for (int j = 0; j < lostYears; j++) {
                    wastedYouth[j] = 0;
                }
            } else if (lostYears < 0) {
                for (int i = 0; i <= (wastedYouth.length - 1 + lostYears); i++) {
                    wastedYouth[i] = wastedYouth[i - lostYears];
                }
                for (int j = (wastedYouth.length - 1); j > (wastedYouth.length + lostYears - 1); j--) {
                    wastedYouth[j] = 0;
                }
            }
            return wastedYouth;
        }
    }
}
