package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a){
        return sum(a) + multiply(a)
                + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10) + calculator.multiply(10)
                + minus(10) + calculator.divide(10)
                + calculator.sumAllOperation(10);
        System.out.println(result);
    }
}
