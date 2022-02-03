package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double pp = (a + b + c) / 2;
        double rs1 = pp * (pp - a) * (pp - b) * (pp - c);
        double rsl = Math.sqrt(rs1);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
