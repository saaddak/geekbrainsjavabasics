package ru.geekbrains.lessonfive;

class Horse extends Animal {
    private final float MAX_RUN = 1500.0f;
    private final float MAX_JUMP = 3.0f;
    private final float MAX_SWIM = 100.0f;

    Horse(String sobriquet, float maxRunDistance, float maxSwimmingDistance, float maxJumpingHeight) {
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
        System.out.println("Коня зовут " + this.getSobriquet() + ".");
        System.out.println("Конь бегает на " + this.getRunDistance() + " м.");
        System.out.println("Конь плавает на " + this.getSwimmingDistance() + " м.");
        System.out.println("Конь прыгает на " + this.getJumpingHeight() + " м.");
        System.out.println();
    }

    @Override
    void runBoyRun(float distance) {
        if(distance <= this.getRunDistance()) {
            System.out.println("Конь " + this.getSobriquet() + " с радостью пробежал " + distance + " м, лишь ласковый ветерок теребил гриву.");
        } else {
            System.out.println("Конь " + this.getSobriquet() + " бежал на " + distance + " м, но после " + this.getRunDistance() + " м, весь в мыле, остановился.");
        }
    }

    @Override
    void swimingAndSwiming(float distance) {
        if(distance <= this.getSwimmingDistance()) {
            System.out.println("Конь " + this.getSobriquet() + " поплыл на " + distance + " м. Без особого энтузиазма, однако.");
        } else {
            System.out.println("Конь " + this.getSobriquet() + " отказался плыть на " + distance + " м. Долго артачился, не хотел заходить в воду. После третьей попытки сбросить седока, от этой идеи пришлось отказаться.");
        }
    }

    @Override
    void jumper(float height) {
        if(height <= this.getJumpingHeight()) {
            System.out.println("Конь " + this.getSobriquet() + " лихо прыгнул на " + height + " м.");
        } else {
            System.out.println("Конь " + this.getSobriquet() + " пытался прыгнуть на " + height + " м, но не смог и чуть было не сломал себе ногу. От дальнейших авантюр в этом направлении было решено отказаться.");
        }
    }
}
