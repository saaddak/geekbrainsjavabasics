package ru.geekbrains.lessonfive;

class Bird extends Animal {
    private final float MAX_RUN = 5.0f;
    private final float MAX_JUMP = 0.2f;
    private final float MAX_SWIM = 0.0f;

    Bird(String sobriquet, float maxRunDistance, float maxSwimmingDistance, float maxJumpingHeight) {
        this.setSobriquet(sobriquet);
        if(maxRunDistance > MAX_RUN || maxRunDistance < 0) {
            this.setRunDistance(MAX_RUN);
        } else {
            this.setRunDistance(maxRunDistance);
        }
        if(maxSwimmingDistance > MAX_SWIM || maxSwimmingDistance < 0) {
            this.setSwimmingDistance(MAX_SWIM);
        } else {
            this.setSwimmingDistance(maxSwimmingDistance);
        }
        if(maxJumpingHeight > MAX_JUMP || maxJumpingHeight < 0) {
            this.setJumpingHeight(MAX_JUMP);
        } else {
            this.setJumpingHeight(maxJumpingHeight);
        }
    }

    @Override
    void animalInfo() {
        System.out.println("Птичку зовут " + this.getSobriquet() + ".");
        System.out.println("Птичка бегает на " + this.getRunDistance() + " м.");
        System.out.println("Птичка не плавает, она не водоплавающая.");
        System.out.println("Птичка прыгает на " + this.getJumpingHeight() + " м.");
        System.out.println();
    }

    @Override
    void runBoyRun(float distance) {
        if(distance <= this.getRunDistance()) {
            System.out.println("Птичка " + this.getSobriquet() + " пробежала " + distance + " м.");
        } else {
            System.out.println("Птичка " + this.getSobriquet() + " не сможет пробежать" + distance + " м. ");
        }
    }

    @Override
    void swimingAndSwiming(float distance) {
        System.out.println("Птичка " + this.getSobriquet() + " не водоплавающая! Она не поплывёт!");
    }

    @Override
    void jumper(float height) {
        if(height <= this.getJumpingHeight()) {
            System.out.println("Птичка " + this.getSobriquet() + " прыгнула на " + height + " м.");
        } else {
            System.out.println("Птичка " + this.getSobriquet() + " не сможет прыгнуть на " + height + " м.");
        }
    }
}
