package ru.job4j.data;

import java.time.format.DateTimeFormatter;

public class StartUIData {
    public static void main(String[] args) {
    ItemData item = new ItemData();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    String currentDate = item.getCreated().format(formatter);
    System.out.println("Текущие дата и время после форматирования: " + currentDate);

}
}
