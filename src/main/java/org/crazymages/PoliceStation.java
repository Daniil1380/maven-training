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

    //В нее поступает два числа - первое - длина срока, второе - тяжесть преступления
    //найти, через сколько лет можно будет получить помилование

    //Если тяжесть = 0, то помиливание - сразу -> 0
    //Если тяжесть = 1, то только через половину срока
    //Если тяжесть = 2, то только после 90% от срока***

    //10, 0 -> 0
    //50, 1 -> 25
    //60, 2 -> 54




}
