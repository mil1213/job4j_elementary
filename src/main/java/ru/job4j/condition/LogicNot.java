package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositiv(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositiv(int num) {
        return !isPositiv(num);
    }

    public static boolean notEvenAndPositiv(int num) {
        return notEven(num) && isPositiv(num);
    }

    public static boolean evenOrNotPositiv(int num) {
        return isEven(num) || notPositiv(num);
    }
}
