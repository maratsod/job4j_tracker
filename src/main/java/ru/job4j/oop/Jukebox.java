package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox item = new Jukebox();
        int song = 1;
        int songTwo = 2;
        int songNo = 3;
        item.music(song);
        item.music(songTwo);
        item.music(songNo);
    }
    public void music(int position) {
        if(position == 1){
        System.out.println("Пусть бегут неуклюже");}
        else if(position == 2){
            System.out.println("Спокойной ночи");}
        else{
            System.out.println("Песня не найдена");}
    }
}
