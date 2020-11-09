package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("annakim@mail.ru", "Anna Kim");
        map.put("antonkun@mail.ru", "Anton Kun");
        map.put("sarachan@mail.ru", "Sara Chan");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
