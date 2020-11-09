package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order value : orders) {
            String key = value.getNumber();
            map.put(key, value);
        }
        return map;
    }
}
