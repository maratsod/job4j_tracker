package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean player = false;
        while (0 < matches) {
            if (player == false) {
                System.out.println("Ходит 1 игрок");
                player = !player;
            } else if (player == true) {
                System.out.println("Ходит 2 игрок");
                player = !player;
            }

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
        if (player == true) {
            System.out.println("Победил игрок 1");
        }
        else if (player == false) {
            System.out.println("Победил игрок 2");
        }
        }
    }
