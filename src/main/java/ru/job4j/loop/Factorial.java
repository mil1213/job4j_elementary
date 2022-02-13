package ru.job4j.loop;

public class Factorial {
    public static int calk(int n) {
        int result = 1;
        if (n > 1) {
            for (int ind = 1; ind <= n; ind++) {
                result = result * ind;
            }
        }
        return result;
    }
}
