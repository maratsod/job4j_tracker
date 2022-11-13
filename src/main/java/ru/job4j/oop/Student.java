package ru.job4j.oop;

public class Student extends Object {
    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.song(song);
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

}
