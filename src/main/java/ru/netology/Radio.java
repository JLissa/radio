package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberCurrentRadioStation;
    private int maxNumberRadioStation;
    private int minNumberRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

//    public Radio() {
//        maxNumberRadioStation = 9;
//    }
    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation - 1;
    }

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

    public void prevRadioStation() {
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
