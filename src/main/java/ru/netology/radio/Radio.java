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
        this.radioStation= RadioStation;
    }

    public void setNextStation(int RadioStation){
        if (RadioStation == 9) {
            return;
        }
    }
}
