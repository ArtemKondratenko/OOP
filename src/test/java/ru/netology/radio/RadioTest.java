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

        assertEquals(expected,actual);
    }
    @Test
    public void nextRadioStation() {
        Radio rad = new Radio();

        rad.setNextStation(5);

        int expected = 5;
        int actual = rad.getRadioStation();

        assertEquals(expected,actual);
    }
}