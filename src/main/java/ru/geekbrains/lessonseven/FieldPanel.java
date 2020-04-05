package ru.geekbrains.lessonseven;

import javax.swing.*;
import java.awt.*;

class FieldPanel extends JPanel {
    static final int MODE_HVH = 0;
    static final int MODE_HVA = 1;

    /*FieldPanel() {
        setBackground(Color.LIGHT_GRAY);
    }*/

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("Режим игры: %d\nРазмер поля: %d на %d,\nДлина победной комбинации: %d\n", gameMode, fieldSizeX, fieldSizeY, winLength);
    }
}

/*
1. Полностью разобраться с кодом (попробовать полностью самостоятельно
переписать одно из окон)

2. Составить список вопросов и приложить в виде комментария к домашней
работе

3. * Расчертить панель Map на поле для игры, согласно fieldSize
* */
