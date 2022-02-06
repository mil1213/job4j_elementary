package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifDiv(double first, double second) {
        return dif(first, second)
                + div(first, second);
    }

    public static double sumSumMultiplyDifDiv(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + dif(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета2 равен: " + sumDifDiv(10, 20));
        System.out.println("Результат расчета3 равен: " + sumSumMultiplyDifDiv(10, 20));
    }

}
