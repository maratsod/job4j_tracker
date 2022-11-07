package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (!condition) {
            System.out.println("Ball run away");
        } else {
            System.out.println("Ball is eaten");
        }
    }
}
