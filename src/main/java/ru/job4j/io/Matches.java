package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean player = false;
        while (0 < matches) {
            player = !player;
            System.out.println(String.format("Ходит %s игрок", player ? "1" : "2"));
            System.out.println("Возьмите спички от 1 до 3");
            int select = Integer.valueOf(input.nextLine());
            if (0 < select && select < 4) {
                matches -= select;
                System.out.println("На столе осталось спичек: " + matches);
            } else {
                System.out.println("Возьмите спички от 1 до 3");
            }
            System.out.println();
        }
        System.out.println("Game over");
        System.out.println(String.format("Победил игрок %s", player ? "1" : "2"));
        }
    }
