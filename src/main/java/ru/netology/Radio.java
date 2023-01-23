package ru.netology;

public class Radio {
    private int numberCurrentRadioStation;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation > maxNumberRadioStation) {
            return;
        }
        if (newNumberCurrentRadioStation < minNumberRadioStation) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (numberCurrentRadioStation < maxNumberRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        } else {
            numberCurrentRadioStation = minNumberRadioStation;
        }
    }

    public void PrevRadioStation() {
        if (numberCurrentRadioStation > minNumberRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        } else {
            numberCurrentRadioStation = maxNumberRadioStation;
        }
    }

    public int getCurrentVolumeSound() {
        return currentVolume;
    }

    public void setCurrentVolumeSound(int newCurrentVolumeSound) {
        if (newCurrentVolumeSound > maxVolume) {
            return;
        }
        if (newCurrentVolumeSound < minVolume) {
            return;
        }
        currentVolume = newCurrentVolumeSound;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
