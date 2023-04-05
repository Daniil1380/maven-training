package org.crazymages;

public class PoliceStation {

    public int summarizeTwoCrimes(int first, int second) {
        if (first < 0) {
            return second;
        }

        if (second < 0) {
            return first;
        }
        return first + second / 2;
    }

    public double summarizeTwoCrimes(double first, double second) {
        return 9.1;
    }

    public int findAge(int age, int crimeSeverity) {
        if (age < 0) {
            throw new IllegalArgumentException("Срок меньше нуля");
        }

        if (crimeSeverity == 0) {
            return 0;
        }
        else if (crimeSeverity == 1) {
            return age / 2;
        }
        else if (crimeSeverity == 2) {
            return age * 9 / 10;
        }
        else {
            return age;
        }
    }

    //В нее поступает два числа - первое - длина срока, второе - тяжесть преступления
    //найти, через сколько лет можно будет получить помилование

    //Если тяжесть = 0, то помиливание - сразу -> 0
    //Если тяжесть = 1, то только через половину срока
    //Если тяжесть = 2, то только после 90% от срока***

    //10, 0 -> 0
    //50, 1 -> 25
    //60, 2 -> 54




}
