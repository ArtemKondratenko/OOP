package ru.netology.radio;

public class Radio {

    private int radioStation;
    private int volume;

    public int getRadioStation() {
        return radioStation;
    }


    public void setRadioStation(int radioStation) {
        if(radioStation < 0 || radioStation > 9) {
            return;
        } else {
            this.radioStation = radioStation;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 10) {
            return;
        }
        else {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume == 10) {
            return;
        }
        volume = volume + 1;
        setVolume(volume);
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
            setVolume(volume);
        }
    }
}
