package ru.netology.radio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    @DisplayName("проверка пределов номера радиостанции")
    public void limitRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        Integer expected = 5;
        Integer actual = rad.getRadioStation();
        assertEquals(expected, actual);
        rad.setRadioStation(10);
        actual = rad.getRadioStation();
        assertNull(actual);
        rad.setRadioStation(-1);
        actual = rad.getRadioStation();
        assertNull(actual);
    }

    @Test
    @DisplayName("проверка правильности переключений следующей радиостанций")
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(9);
        rad.nextStation();
        Integer expected = 0;
        Integer actual = rad.getRadioStation();
        assertEquals(expected, actual);
        rad.setRadioStation(7);
        rad.nextStation();
        expected = 8;
        actual = rad.getRadioStation();
        assertEquals(expected, actual);
        rad.setRadioStation(-2);
        assertThrows(NullPointerException.class, rad::nextStation);
        rad.setRadioStation(10);
        assertThrows(NullPointerException.class, rad::nextStation);
    }

    @Test
    @DisplayName("проверка работы переключателя предыдущей радиостанции")
    public void prevRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(0);
        rad.prevStation();
        Integer expected = 9;
        Integer actual = rad.getRadioStation();
        assertEquals(expected, actual);
        rad.setRadioStation(4);
        rad.prevStation();
        expected = 3;
        actual = rad.getRadioStation();
        assertEquals(expected,actual);
        rad.setRadioStation(-1);
        assertThrows(NullPointerException.class,rad::prevStation);
        rad.setRadioStation(11);
        assertThrows(NullPointerException.class,rad::prevStation);

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
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
        radio.setVolume(7);
        radio.increaseVolume();
        expected = 8;
        actual = radio.getVolume();
        assertEquals(expected, actual);
        radio.setVolume(-1);
        assertThrows(NullPointerException.class, radio::increaseVolume);
        radio.setVolume(11);
        assertThrows(NullPointerException.class, radio::increaseVolume);

    }

    @Test
    public void checkNegativeVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
        radio.setVolume(7);
        radio.decreaseVolume();
        expected = 6;
        actual = radio.getVolume();
        assertEquals(expected, actual);
        radio.setVolume(-1);
        assertThrows(NullPointerException.class, radio::decreaseVolume);
        radio.setVolume(11);
        assertThrows(NullPointerException.class, radio::decreaseVolume);

    }

}