package ru.netology.radio;

public class Radio {

<<<<<<< Updated upstream
    private Integer radioStation;
    private Integer volume;
    private Integer minStation = 0;
    private Integer numberRadioStations = 10;
    private Integer maxStation = numberRadioStations - 1;
    private Integer maxVolume = 100;
    private Integer minVolume = 0;
=======
    private int radioStation = 10;
    private int volume;
    private  int minRadioStation = 0;
    private int maxRadioStation = radioStation - 1;
    private  int minVolume = 0;
    private  int maxVolume = 100;
>>>>>>> Stashed changes

    public Radio(Integer numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public Radio() {
    }

<<<<<<< Updated upstream
    public Integer getNumberRadioStations() {
        return numberRadioStations;
    }

    public Integer getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0 || radioStation >= numberRadioStations) {
            radioStation = 0;
=======
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
>>>>>>> Stashed changes
        }
        this.radioStation = radioStation;
    }

    public void nextStation() {
<<<<<<< Updated upstream
        if (radioStation == numberRadioStations - 1) {
            radioStation = minStation;
        } else {
            radioStation++;
=======
        if (radioStation == maxRadioStation) {
            this.radioStation = 0;
        } else {
            this.radioStation = radioStation + 1;
            setRadioStation(radioStation);
>>>>>>> Stashed changes
        }
    }

    public void prevStation() {
<<<<<<< Updated upstream
        if (radioStation == 0) {
            radioStation = maxStation;
=======
        if (radioStation == minRadioStation) {
            radioStation = maxRadioStation;
>>>>>>> Stashed changes
        } else {
            radioStation--;
        }
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume || volume > maxVolume) {
<<<<<<< Updated upstream
            this.volume = 0;
        } else {
=======
            return;
        }
        else {
>>>>>>> Stashed changes
            this.volume = volume;
        }
    }

    public void increaseVolume() {
<<<<<<< Updated upstream
        if (volume < maxVolume) {
            this.volume++;
=======
        if (volume == maxVolume) {
            return;
>>>>>>> Stashed changes
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
<<<<<<< Updated upstream
            this.volume--;
=======
            volume = volume - 1;
            setVolume(volume);
>>>>>>> Stashed changes
        }
    }
}