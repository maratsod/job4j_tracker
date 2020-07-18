package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String item = word.engToRus();
        System.out.println(item);
    }
    public String engToRus() {
        String eng = "Knowledge";
        return "Неизвестное слово. " + eng;
    }
}
