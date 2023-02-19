package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void currentStation() {
        Radio radio = new Radio(50);
        radio.setNumberCurrentRadioStation(48);

        Assertions.assertEquals(48, radio.getNumberCurrentRadioStation());
    }
    @Test
    public void numberCurrentStationTest() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastRadioStationTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToTheNextRadioStationTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(5);
        radio.nextRadioStation();

        int expected = 6;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstRadioStationTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToThePrevRadioStationTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(8);
        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void directRadioStationSelectionTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(3);

        int expected = 3;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationMoreMaxTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationLessMinTest() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundReachedMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(15);
        radio.increaseVolume();

        int expected = 16;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundReachedMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(48);
        radio.decreaseVolume();

        int expected = 47;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeSoundMoreMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(101);

        int expected = 0;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeSoundLessMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(-1);

        int expected = 0;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }
}