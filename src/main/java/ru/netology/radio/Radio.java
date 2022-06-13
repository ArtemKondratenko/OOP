package ru.netology.radio;

public class Radio {

    private Integer radioStation;
    private Integer volume;

    public Integer getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int RadioStation) {
        if (RadioStation < 0 || RadioStation > 9) {
            radioStation = null;
        }
        else {
            this.radioStation = RadioStation;
        }

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

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 10) {
            this.volume = null;
        }
        else {
            this.volume = volume;
        }

    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
            setVolume(volume);
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
            setVolume(volume);
        }
    }
}