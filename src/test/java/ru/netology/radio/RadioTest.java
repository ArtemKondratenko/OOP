package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
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
    public void maxlimitRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(11);
        Assertions.assertEquals(9, rad.getRadioStation());
    }

    @Test
    public void setNormalMinLimit() {
        Radio rad = new Radio();
        rad.setRadioStation(0);
        Assertions.assertEquals(0, rad.getRadioStation());
    }

    @Test
    public void setNormalMaxLimit() {
        Radio rad = new Radio();
        rad.setRadioStation(9);
        Assertions.assertEquals(9, rad.getRadioStation());
    }

    @Test
    public void  setStation20() {
        Radio radio = new Radio(20);
        radio.setRadioStation(5);
        radio.setRadioStation(15);
        Assertions.assertEquals(15, radio.getRadioStation());
    }


    @Test
    public void minLimitRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(-1);
        Assertions.assertEquals(0, rad.getRadioStation());
    }

    @Test
    @DisplayName("проверка правильности переключений следующей радиостанций")
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        rad.nextStation();
        Assertions.assertEquals(6, rad.getRadioStation());
    }

    @Test
    public void nextRadioStationWhenCrossedUpperLimit() {
        Radio rad = new Radio();
        rad.setRadioStation(9);
        rad.nextStation();
        Assertions.assertEquals(0, rad.getRadioStation());
    }

    @Test
    @DisplayName("проверка работы переключателя предыдущей радиостанции")
    public void prevRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(3);
        rad.prevStation();
        Assertions.assertEquals(2, rad.getRadioStation());
    }

    @Test
    @DisplayName("проверка работы переключателя предыдущей радиостанции")
    public void prevRadioStationDownBound() {
        Radio rad = new Radio();
        rad.setRadioStation(0);
        rad.prevStation();
        Assertions.assertEquals(9, rad.getRadioStation());
    }

    @Test
    public void checkVolume() {
        Radio vol = new Radio();
        vol.setVolume(5);
        int expected = 5;
        assertEquals(expected, vol.getVolume());
    }

    @Test
    public void maxVolume() {
        Radio volume = new Radio();
        volume.setVolume(101);
        int expected = 0;
        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void minVolume() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        int expected = 0;
        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void checkPlusVolume() {
        Radio volume = new Radio();
        volume.setVolume(4);
        volume.increaseVolume();
        Assertions.assertEquals(5, volume.getVolume());
    }

    @Test
    public void checkPlusVolumeMax() {
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.increaseVolume();
        Assertions.assertEquals(100, volume.getVolume());
    }

    @Test
    public void checkMinVolumeMin() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.decreaseVolume();
        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void checkNegativeVolume() {
        Radio volume = new Radio();
        volume.setVolume(-3);
        volume.decreaseVolume();
        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void checkDecreaseVolume() {
        Radio volume = new Radio();
        volume.setVolume(6);
        volume.decreaseVolume();
        Assertions.assertEquals(5, volume.getVolume());
    }

}