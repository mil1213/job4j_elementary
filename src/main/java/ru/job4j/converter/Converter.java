package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in1 = 420;
        float in2 = 4;
        float exp1e = 6;
        float exp1d = 7;
        float exp2e = 280;
        float exp2d = 240;
        float euro = Converter.rubleToEuro(in1);
        float dollar = Converter.rubleToDollar(in1);
        float roubleFromEuro = Converter.euroToRuble(in2);
        float roubleFromDollar = Converter.dollarToRuble(in2);
        boolean eutest = exp1e == euro;
        System.out.println(in1 + " rubles are " + euro + " euro. Test result : " + eutest);
        boolean doltest = exp1d == dollar;
        System.out.println(in1 + " rubles are " + dollar + " dollar. Test result : " + doltest);
        boolean rfetest = exp2e == roubleFromEuro;
        System.out.println(in2 + " euro are " + roubleFromEuro + " rubles. Test result : " + rfetest);
        boolean rfdtest = exp2d == roubleFromDollar;
        System.out.println(in2 + " dollar are " + roubleFromDollar + " rubles. Test result : " + rfdtest);
    }
}
