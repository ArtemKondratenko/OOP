package ru.netology.radio;

public class Radio {

    private Integer radioStation;
    private Integer volume;
    private Integer maxStation = 10;
    private Integer minStation = 0;
    private Integer numberRadioStations;
    private  Integer maxVolume = 100;
    private  Integer minVolume = 0;

    public Radio(Integer numberRadioStations) {
        this.radioStation = numberRadioStations;
    }
    public  Radio(){

    }



    public Integer getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int RadioStation) {
        if (RadioStation < 0 || RadioStation > 9) {
            radioStation = null;
        }
        if (RadioStation == 10) {
            radioStation = 9;
        }
        else {
            this.radioStation = RadioStation;
        }

    }

    public void nextStation() {
        if (radioStation == 9) {
            radioStation = minStation;
        }
    }

    public void prevStation() {
        if (radioStation == 0) {
            radioStation = maxStation;
        }
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume || volume > maxVolume) {
            this.volume = null;
        }
        else {
            this.volume = volume;
        }

    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            this.volume = null;
        }
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            this.volume = null;
        }
    }
}