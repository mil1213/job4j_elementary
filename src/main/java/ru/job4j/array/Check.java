package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
