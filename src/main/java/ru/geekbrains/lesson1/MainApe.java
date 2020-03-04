package ru.geekbrains.lesson1;

public class MainApe {
    public static void main(String[] args) {
        byte byted = 100;
        short shorty = 30_000;
        int inty = 2_000_000_000;
        long longy = 9_223_372_036_854_775_000L;
        float floaty = 123.45f;
        double doubly = 321.321;
        char charry = 181;
        boolean booleany = true;
        System.out.println("byted: " + byted + "\nshorty: " + shorty + "\ninty: " + inty + "\nlongy: " + longy + "\nfloaty: " + floaty + "\ndoubly: " + doubly + "\ncharry: " + charry + "\nbooleany: " + booleany + "\n");
        System.out.println("dummy: " + dummy(12.5f, 13.4f, 65.44f, 6.0f) + "\n");
        System.out.println("isInRange 5 + 5: " + isInRange(5, 5));
        System.out.println("isInRange 15 + 6: " + isInRange(15, 6));
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
}
