package ru.netology.radio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testConstructor() {
        Radio rad = new Radio(5);
        Assertions.assertNotNull(rad);
        Assertions.assertEquals(5, rad.getRadioStation());
    }


    @Test
    @DisplayName("проверка пределов номера радиостанции")
    public void limitRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        Integer expected = 5;
        Integer actual = rad.getRadioStation();
        assertEquals(expected, actual);
        rad.setRadioStation(10);
<<<<<<< Updated upstream
        actual = rad.getRadioStation();
        assertEquals(0, actual);
        rad.setRadioStation(-1);
        actual = rad.getRadioStation();
        assertEquals(0, actual);
=======
        Assertions.assertEquals(9,rad.getRadioStation());
    }

    @Test
    public  void setNormalMinLimit() {
        Radio rad = new Radio();
        rad.setRadioStation(0);
        Assertions.assertEquals(0,rad.getRadioStation());
    }

    @Test
    public  void setNormalMaxLimit() {
        Radio rad = new Radio();
        rad.setRadioStation(9);
        Assertions.assertEquals(9,rad.getRadioStation());
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        int actual = vol.getVolume();
        assertEquals(expected, actual);
=======
        assertEquals(expected, vol.getVolume());
    }

    @Test
    public void  maxVolume() {
        Radio volume = new Radio();
        volume.setVolume(101);
        int expected = 0;
        Assertions.assertEquals(0,volume.getVolume());
    }

    @Test
    public  void  minVolume() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        int expected = 0;
        Assertions.assertEquals(0, volume.getVolume());
>>>>>>> Stashed changes
    }

    @Test
    public void checkPlusVolume() {
<<<<<<< Updated upstream
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
=======
        Radio volume = new Radio();
        volume.setVolume(4);
        volume.increaseVolume();
        Assertions.assertEquals(5, volume.getVolume());
    }

    @Test
    public  void checkPlusVolumeMax() {
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.increaseVolume();
        Assertions.assertEquals(100, volume.getVolume());
>>>>>>> Stashed changes
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