package ru.netology.radio;

public class Radio {

    private Integer radioStation;
    private Integer volume;
    private Integer minStation = 0;
    private Integer numberRadioStations = 10;
    private Integer maxStation = numberRadioStations - 1;
    private Integer maxVolume = 100;
    private Integer minVolume = 0;

    public Radio(Integer numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public Radio() {
    }


    public Integer getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0 || radioStation >= numberRadioStations) {
            radioStation = 0;
        }
        this.radioStation = radioStation;
    }

    public void nextStation() {
        if (radioStation == numberRadioStations - 1) {
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
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            this.volume--;
        }
    }
}