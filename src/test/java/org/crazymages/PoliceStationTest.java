package org.crazymages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceStationTest {

    @Test
    public void test() {
        PoliceStation policeStation = new PoliceStation();

        int expected = 3;
        int actual = policeStation.summarizeTwoCrimes(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        PoliceStation policeStation = new PoliceStation();

        int expected = 2;
        int actual = policeStation.summarizeTwoCrimes(2, -4);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        PoliceStation policeStation = new PoliceStation();

        int expected = 0;
        int actual = policeStation.summarizeTwoCrimes(0, 0);

        assertEquals(expected, actual);
    }

}