package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle ship = new Ship();

        Vehicle[] vehicles = new Vehicle[]{plane, train, ship};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
