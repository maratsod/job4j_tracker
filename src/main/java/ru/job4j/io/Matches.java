package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        while (0 < matches) {
            System.out.println("Возьмите спички от 1 до 3");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                matches -= select;
                if (matches < 0){
                    System.out.println("На столе не осталось спичек");
                }
                 else {
                    System.out.println("На столе осталось спичек: " + matches);
                }
            } else if (select == 2) {
                matches -= select;
                if (matches < 0){
                    System.out.println("На столе не осталось спичек");
                }
                else {
                    System.out.println("На столе осталось спичек: " + matches);
                }
            } else if (select == 1) {
                matches -= select;
                if (matches < 0){
                    System.out.println("На столе не осталось спичек");
                }
                else {
                    System.out.println("На столе осталось спичек: " + matches);
                }
            } else {
                System.out.println("Возьмите спички от 1 до 3");
            }

            System.out.println();
        }
    }
}
