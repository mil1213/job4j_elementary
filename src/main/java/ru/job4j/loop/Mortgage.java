package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double curr = amount + amount * percent * 0.01;
        while (curr > 0) {
        year = year + 1;
        curr = curr - salary;
        }
        return year;
    }
}
