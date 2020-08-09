package ru.job4j.poly;

public class Bus implements Transport{
    int passenger;
    int price;

    @Override
    public int drive() {
        return 0;
    }

    @Override
    public int passengers(int passenger) {
        return 0;
    }

    @Override
    public int fillUp(int gasoline) {
        return price;
    }
}
