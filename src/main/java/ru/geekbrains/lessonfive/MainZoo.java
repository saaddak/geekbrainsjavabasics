package ru.geekbrains.lessonfive;

public class MainZoo {
    public static void main(String[] args) {
        Dog muhtar = new Dog("Мухтар", 10_000.0f, 800.0f, 0.6f);
        muhtar.animalInfo();
        muhtar.runBoyRun(8_000.0f);
        muhtar.swimingAndSwiming(11.0f);
        muhtar.jumper(1.0f);
        System.out.println();

        Cat peaches = new Cat("Персик", 20.0f, 2.0f, 1.5f);
        peaches.animalInfo();
        peaches.runBoyRun(18.0f);
        peaches.swimingAndSwiming(1.2f);
        peaches.jumper(1.4f);
        System.out.println();

        Bird popka = new Bird("Попка", 2.0f, 0.0f, 0.1f);
        popka.animalInfo();
        popka.runBoyRun(2.0f);
        popka.swimingAndSwiming(0.0f);
        popka.jumper(0.2f);
        System.out.println();

        Horse innokentiy = new Horse("Иннокентий", 1500.0f, 80.0f, 2.8f);
        innokentiy.animalInfo();
        innokentiy.runBoyRun(2000.0f);
        innokentiy.swimingAndSwiming(80.0f);
        innokentiy.jumper(2.0f);
        System.out.println();
    }
}
