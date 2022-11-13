package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("let's go");
    }

    @Override
    public void passengers(int passes) {
        System.out.println("Passengers: " + passes);
    }

    @Override
    public int gasoline(int gas) {
        return gas * 100;
    }
}
