package ru.netology.radio;

public class Radio {

    private int radioStation = 10;
    private int volume;
    private  int minRadioStation = 0;
    private int maxRadioStation = radioStation - 1;
    private  int minVolume = 0;
    private  int maxVolume = 100;

    public int getRadioStation() {
        return radioStation;
    }

    public Radio(int desiredNumberRadioStations) {
        this.radioStation = desiredNumberRadioStations;
    }

    public  Radio(){}

    public void setRadioStation(int radioStation) {
        if(radioStation > maxRadioStation) {
            this.radioStation = maxRadioStation;
        }
        else if (radioStation < minRadioStation) {
            this.radioStation = minRadioStation;
        }
        else {
            this.radioStation = radioStation;
        }
    }

    public void nextStation() {
        if (radioStation == maxRadioStation) {
            this.radioStation = 0;
        } else {
            this.radioStation = radioStation + 1;
            setRadioStation(radioStation);
        }
    }

    public void prevStation() {
        if (radioStation == minRadioStation) {
            radioStation = maxRadioStation;
        } else {
            radioStation = radioStation - 1;
            setRadioStation(radioStation);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume || volume > maxVolume) {
            return;
        }
        else {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        }
        volume = volume + 1;
        setVolume(volume);
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
            setVolume(volume);
        }
    }
}
