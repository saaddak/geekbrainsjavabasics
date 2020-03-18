package ru.geekbrains.lessonfive;

abstract class Animal {
    private String sobriquet;
    private float maxRunDistance;
    private float maxSwimmingDistance;
    private float maxJumpingHeight;
    private final float MAX_RUN = 3000.0f;
    private final float MAX_SWIM = 1000.0f;
    private final float MAX_JUMP = 10.0f;

    /* К сожалению, не хватило времени на осознание, каким образом используемый в потомке через `super` конструктор
     * родительского класса получит и обработает максимальные значения для каждого подкласса. Применение `this.MAX_RUN`
     * (и прочих) при вызове из класса-наследника, вполне ожидаемо не привело к желаемому результату, значение
     * оставалось таким, каким оно было определено в родительском классе.
     * Так что, пока пришлось оставить размноженную портянку конструктора в наследуемых классах. */
    /*Animal(String sobriquet, float maxRunDistance, float maxSwimmingDistance, float maxJumpingHeight) {
        this.setSobriquet(sobriquet);

        if(maxRunDistance > this.MAX_RUN || maxRunDistance < 0) { this.setRunDistance(this.MAX_RUN); }
        else { this.setRunDistance(maxRunDistance); }

        if(maxSwimmingDistance > this.MAX_SWIM || maxSwimmingDistance < 0) { this.setSwimmingDistance(this.MAX_SWIM); }
        else { this.setSwimmingDistance(maxSwimmingDistance); }

        if(maxJumpingHeight > this.MAX_JUMP || maxJumpingHeight < 0) { this.setJumpingHeight(this.MAX_JUMP); }
        else { this.setJumpingHeight(maxJumpingHeight); }
    }*/

    void setSobriquet(String sobriquet) { this.sobriquet = sobriquet; }
    String getSobriquet() { return sobriquet; }

    void setRunDistance(float maxRunDistance) { this.maxRunDistance = maxRunDistance; }
    float getRunDistance() { return maxRunDistance; }

    void setSwimmingDistance(float maxSwimmingDistance) { this.maxSwimmingDistance = maxSwimmingDistance; }
    float getSwimmingDistance() { return maxSwimmingDistance; }

    void setJumpingHeight(float maxJumpingHeight) { this.maxJumpingHeight = maxJumpingHeight; }
    float getJumpingHeight() { return maxJumpingHeight; }

    abstract void animalInfo();
    abstract void runBoyRun(float distance);
    abstract void swimingAndSwiming(float distance);
    abstract void jumper(float height);
}
