package ru.netology.radio;

public class Radio {

    private int radioStation;
    private int volume;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int RadioStation) {
        if (RadioStation < 0) {
            return;
        }
        if (RadioStation > 9) {
            return;
        }
        this.radioStation = RadioStation;
    }

    public void nextStation() {
        if (radioStation == 9) {
            radioStation = 0;
        } else {
            radioStation = radioStation + 1;
            setRadioStation(radioStation);
        }
    }

    public void prevStation() {
        if (radioStation == 0) {
            radioStation = 9;
        } else {
            radioStation = radioStation - 1;
            setRadioStation(radioStation);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 9) {
            return;
        }
        this.volume = volume;
    }

    public void maxVolume() {
        if (volume == 9) {
            setVolume(volume);
        }
    }

    public void minVolume() {
        if (volume == 0) {
            setVolume(volume);

        }
    }
}