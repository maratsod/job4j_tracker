package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
