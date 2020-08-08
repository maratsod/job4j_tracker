package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int turn = 2;
        while (0 < matches) {
            if (turn % 2 ==0) {
                System.out.println("Ходит 1 игрок");
                turn++;
            } else {
                System.out.println("Ходит 2 игрок");
                turn++;
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
        }
    }
