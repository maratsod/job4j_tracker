package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String x : value) {
            rsl++;
        if (x != key){
            throw new ElementNotFoundException("key is not found");
        }
    }
        return rsl;
    }


    public static void main(String[] args) {
        try {
            String[] colours = { "Red", "Orange", "Yellow", "Green" };
            indexOf(colours , "b");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
