package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare zayats = new Hare();
        Wolf volk = new Wolf();
        Fox lis = new Fox();
        zayats.tryEat(ball);
        volk.tryEat(ball);
        lis.tryEat(ball);
    }

}