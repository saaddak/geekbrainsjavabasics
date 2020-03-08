package ru.geekbrains.lessonone;

class Diplomancer {
    static String sayMyName(String myName) {
        if(myName.equals("Вернер Карл Гейзенберг") || myName.equals("Вернер Гейзенберг") || myName.equals("Карл Гейзенберг") || myName.equals("Гейзенберг") || myName.equals("Werner Karl Heisenberg") || myName.equals("Werner Heisenberg") || myName.equals("Karl Heisenberg") || myName.equals("Heisenberg")) {
            return "Ты чертовски прав!";
        } else {
            return ("Привет, " + myName + "!");
        }
    }
}
