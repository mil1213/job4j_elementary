package ru.job4j.loop;

public class Fitness {
    public static int calk(int ivan, int nik) {
        int mounth = 0;
        while (ivan <= nik) {
            mounth = mounth + 1;
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return mounth;
    }
}
