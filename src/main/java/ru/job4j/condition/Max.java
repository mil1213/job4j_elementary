package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = third >= max(first, second) ? third : max(first, second);
        return result;
    }

    public static int max(int first, int second, int third, int forth) {
        int result = forth >= max(first, second, third) ? forth : max(first, second, third);
        return result;
    }
}
