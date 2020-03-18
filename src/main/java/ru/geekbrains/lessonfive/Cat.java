package ru.geekbrains.lessonfive;

class Cat extends Animal {
    private final float MAX_RUN = 200.0f;
    private final float MAX_JUMP = 2.0f;
    private final float MAX_SWIM = 0.0f;

    Cat(String sobriquet, float maxRunDistance, float maxSwimmingDistance, float maxJumpingHeight) {
        this.setSobriquet(sobriquet);

        if(maxRunDistance > MAX_RUN || maxRunDistance < 0) { this.setRunDistance(MAX_RUN); }
        else { this.setRunDistance(maxRunDistance); }

        if(maxSwimmingDistance > MAX_SWIM || maxSwimmingDistance < 0) { this.setSwimmingDistance(MAX_SWIM); }
        else { this.setSwimmingDistance(maxSwimmingDistance); }

        if(maxJumpingHeight > MAX_JUMP || maxJumpingHeight < 0) { this.setJumpingHeight(MAX_JUMP); }
        else { this.setJumpingHeight(maxJumpingHeight); }
    }

    @Override
    void animalInfo() {
        System.out.println("Котеньку зовут " + this.getSobriquet() + ".");
        System.out.println("Котенька бегает на " + this.getRunDistance() + " м.");
        System.out.println("Котенька совсем не плавает.");
        System.out.println("Котенька прыгает на " + this.getJumpingHeight() + " м.");
        System.out.println();
    }

    @Override
    void runBoyRun(float distance) {
        if(distance <= this.getRunDistance()) {
            System.out.println("Котейка " + this.getSobriquet() + " пробежала аж " + distance + " м. Это просто поразительно!");
        } else {
            System.out.println("Котенька " + this.getSobriquet() + " было бежала, но потом ей стало лень и она начала играть со своим хвостом.");
        }
    }

    @Override
    void swimingAndSwiming(float distance) {
        System.out.println("Котейка " + this.getSobriquet() + " не в настроении плавать! Ну разве не ясно?");
    }

    @Override
    void jumper(float height) {
        if(height <= this.getJumpingHeight()) {
            System.out.println("Котейка " + this.getSobriquet() + " прыгнула аж на " + height + " м. Невероятно!");
        } else {
            System.out.println("Котейка " + this.getSobriquet() + ", было, подумала прыгнуть на " + height + " м, однако передумала прыгать и пошла сторожить миску с едой.");
        }
    }
}
