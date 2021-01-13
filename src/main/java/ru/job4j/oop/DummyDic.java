package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String item = word.engToRus("Knowledge");
        System.out.println(item);
    }

    String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
}
