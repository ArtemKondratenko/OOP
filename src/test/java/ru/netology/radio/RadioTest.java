package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void limitRadioStation() {
        Radio rad = new Radio();

        rad.setRadioStation(5);

        int expected = 5;
        int actual = rad.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void limitVolume() {
        Radio vol = new Radio();

        vol.setVolume(5);

        int expected = 5;
        int actual = vol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkPlusVolume() {
        Radio vol = new Radio();
        vol.setVolume(9);

        vol.maxVolume();

        int expected = 9;
        int actual = vol.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkNegativeVolume() {
        Radio vol = new Radio();
        vol.setRadioStation(0);

        vol.minVolume();

        int expected = 0;
        int actual = vol.getVolume();

        assertEquals(expected, actual);

    }

}