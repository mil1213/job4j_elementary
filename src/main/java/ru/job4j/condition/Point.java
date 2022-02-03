package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int rsx = x2 - x1;
        int rsy = y2 - y1;
        double rsx2 = Math.pow(rsx, 2);
        double rsy2 = Math.pow(rsy, 2);
        double sumrs = rsx2 + rsy2;
        double rsl = Math.sqrt(sumrs);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 4, 5, 10);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
