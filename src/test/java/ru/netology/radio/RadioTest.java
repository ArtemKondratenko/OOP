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
        assertEquals(0, actual);
        rad.setRadioStation(-1);
        actual = rad.getRadioStation();
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("проверка установки кол-во станций")
    public void numberRadioStationTest(){
        Radio rad = new Radio(20);
        Integer actual = rad.getNumberRadioStations();
        assertEquals(20,actual);
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
        assertEquals(0,rad.getRadioStation());
        rad.setRadioStation(10);
        assertEquals(0,rad.getRadioStation());
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
        assertEquals(0,rad.getRadioStation());
        rad.setRadioStation(11);
        assertEquals(0,rad.getRadioStation());
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
        int expected = 11;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
        radio.setVolume(7);
        radio.increaseVolume();
        expected = 8;
        actual = radio.getVolume();
        assertEquals(expected, actual);
        radio.setVolume(-1);
        assertEquals(0,radio.getVolume());
        radio.setVolume(101);
        assertEquals(0,radio.getVolume());
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
        assertEquals(0,radio.getVolume());
        radio.setVolume(101);
        assertEquals(0,radio.getVolume());

    }

}