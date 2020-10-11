package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if ( value[i] == key ) {
                System.out.println( key + " is found at index " + rsl);
            }
            rsl++;
    }
        if (rsl == -1) {
            throw new ElementNotFoundException("key is not found");
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
