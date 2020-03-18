package ru.geekbrains.lessonfive;

class Dog extends Animal {
    private final float MAX_RUN = 500.0f;
    private final float MAX_JUMP = 0.5f;
    private final float MAX_SWIM = 10.0f;

    Dog(String sobriquet, float maxRunDistance, float maxSwimmingDistance, float maxJumpingHeight) {
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
        System.out.println("Собаченьку зовут " + this.getSobriquet() + ".");
        System.out.println("Собаченька бегает на " + this.getRunDistance() + " м.");
        System.out.println("Собаченька плавает на " + this.getSwimmingDistance() + " м.");
        System.out.println("Собаченька прыгает на " + this.getJumpingHeight() + " м.");
        System.out.println();
    }

    @Override
    void runBoyRun(float distance) {
        if(distance <= this.getRunDistance()) {
            System.out.println("Собаченька " + this.getSobriquet() + " с большим энтузиазмом побежала на " + distance + " м.");
        } else {
            System.out.println("Собаченька " + this.getSobriquet() + " бежала-бежала, но это только бешеной собаченьке сто  километров - не крюк. Так что, после " + distance + " м собаченька выдохлась и больше не бежала. Нельзя заставлять собаченьку так много бегать!");
        }
    }

    @Override
    void swimingAndSwiming(float distance) {
        if(distance <= this.getSwimmingDistance()) {
            System.out.println("Собаченька " + this.getSobriquet() + " радостно поплыла на " + distance + " м.");
        } else {
            System.out.println("Собаченька " + this.getSobriquet() + " упрямо боролась с неумолимой стихией, но, проплыв половину от " + this.getSwimmingDistance() + " м поняла, что на " + distance + " не доплывёт и вернулась обратно. Собаченьке очень жаль!..");
        }
    }

    @Override
    void jumper(float height) {
        if(height <= this.getJumpingHeight()) {
            System.out.println("Собаченька " + this.getSobriquet() + " прыгнула на " + height + " м.");
        } else {
            System.out.println("Собаченька " + this.getSobriquet() + " пыталась прыгнуть на " + height + " м, но не смогла и прыгнула только на " + this.getJumpingHeight() + " м.");
        }
    }
}
