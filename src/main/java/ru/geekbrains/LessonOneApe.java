package ru.geekbrains;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LessonOneApe {
    public static void main(String[] args) {
        byte byted = 100;
        short shorty = 30_000;
        int inty = 2_000_000_000;
        long longy = 9_223_372_036_854_775_000L;
        float floaty = 123.45f;
        double doubly = 321.321;
        char charry = 181;
        boolean booleany = true;
        String everyoneElse = "Остальные всякие ссылочные типы.";
        System.out.println("Примитивные типы.\n" + "byted: " + byted + "\nshorty: " + shorty + "\ninty: " + inty + "\nlongy: " + longy + "\nfloaty: " + floaty + "\ndoubly: " + doubly + "\ncharry: " + charry + "\nbooleany: " + booleany + "\n");
        System.out.println("Вроде как все остальные ссылочные типы.\n" + "everyoneElse: " + everyoneElse + "\n");
        System.out.println("Результат вычисления выражения a * (b + (c / d)).\n" + "dummy: " + dummy(12.5f, 13.4f, 65.44f, 6.0f) + "\n");
        System.out.println("Результат проверки суммы двух чисел (10 <= сумма >= 20).\n" + "isInRange 5 + 5: " + isInRange(5, 5));
        System.out.println("isInRange 15 + 6: " + isInRange(15, 6) + "\n");
        System.out.println("Проверка числа на неотрицательность.\n" + "isNonnegative 300: " + isNonnegative(300));
        System.out.println("isNonnegative 0: " + isNonnegative(0));
        System.out.println("isNonnegative -1: " + isNonnegative(-1) + "\n");
        System.out.println("Вывод приветствия в консоль.\n" + "Передано имя 'Васисуалий': " + sayMyName("Васисуалий"));
        System.out.println("Передано имя 'Гейзенберг': " + sayMyName("Гейзенберг") + "\n");
        System.out.println("Проверка года на вши... то есть, високосность.\n" + "Високосный ли 2020 год? " + isItLeap(2020));
        System.out.println("А високосный ли год 2021? " + isItLeap(2021) + "\n");
        System.out.println("Это я так, на всякий случай...\n" + "Високосный 2020-й? " + ((GregorianCalendar) Calendar.getInstance()).isLeapYear(2020));
        System.out.println("А 2021 - високосный? " + ((GregorianCalendar) Calendar.getInstance()).isLeapYear(2021));
    }

    static float dummy (float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    static boolean isInRange(int a, int b) {
        if((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isNonnegative(int num) {
        if(num >=0) {
            return true;
        } else {
            return false;
        }
    }

    static String sayMyName(String myName) {
        if(myName.equals("Вернер Карл Гейзенберг") || myName.equals("Вернер Гейзенберг") || myName.equals("Карл Гейзенберг") || myName.equals("Гейзенберг") || myName.equals("Werner Karl Heisenberg") || myName.equals("Werner Heisenberg") || myName.equals("Karl Heisenberg") || myName.equals("Heisenberg")) {
            return "Ты чертовски прав!";
        } else {
            return ("Привет, " + myName + "!");
        }
    }

    static boolean isItLeap(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }
}
