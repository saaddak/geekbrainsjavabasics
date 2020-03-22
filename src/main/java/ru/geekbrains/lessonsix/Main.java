package ru.geekbrains.lessonsix;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {

        final String FIRST_FILE = "epsonOutput.txt";
        final String SECOND_FILE = "brotherOutput.txt";
        final String THIRD_FILE = "ElectronikaMC6312Output.txt";
        final String FIRST_PHRASE = "Призрак бродит по Европе - призрак коммунизма. Все силы старой Европы объединились для священной травли этого призрака: папа и царь, Меттерних и Гизо, французские радикалы и немецкие полицейские. [END OF LINE]";
        final String SECOND_PHRASE = "Где та оппозиционная партия, которую ее противники, стоящие у власти, не ославили бы коммунистической? Где та оппозиционная партия, которая в свою очередь не бросала бы клеймящего обвинения в коммунизме как более передовым представителям оппозиции, так и своим реакционным противникам? [END OF LINE]";

        byte[] firstPhraseBytes = FIRST_PHRASE.getBytes();
        byte[] secondPhraseBytes = SECOND_PHRASE.getBytes();

        writeFile(FIRST_FILE, firstPhraseBytes);
        writeFile(SECOND_FILE, secondPhraseBytes);

        String f1 = readFile(FIRST_FILE);
        String f2 = readFile(SECOND_FILE);

        byte[] thirdPhraseBytes = (f1 + "\n" + f2).getBytes();

        writeFile(THIRD_FILE, thirdPhraseBytes);

        String f3 = readFile(THIRD_FILE);
        System.out.println(f3);

        isContains(FIRST_FILE, "LINE");
    }

    private static void writeFile(String fileName, byte[] byteText) {
        try {
            PrintStream epson = new PrintStream(new FileOutputStream(fileName));
            epson.write(byteText);
            epson.flush();
            epson.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String fileName) {
        try {
            BufferedReader mustek = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
            int currentChar;
            StringBuilder sb = new StringBuilder();
            while ((currentChar = mustek.read()) != -1) {
                sb.append((char) currentChar);
            }
            mustek.close();
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static void isContains(String fileName, String targetWord) {
        try {
            Scanner hp = new Scanner(new File(fileName));
            while (null != hp.findWithinHorizon("(?i)\\b" + targetWord+ "\\b", 0)) {
                MatchResult mr = hp.match();
                System.out.printf("Слово: '%s' найдено. Начальная позиция: %d.", mr.group(), mr.start());
            }
            hp.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
