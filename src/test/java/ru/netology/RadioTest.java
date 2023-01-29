package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void numberCurrentStationTest() {

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchLastRadioStationTest() {
        radio.setNumberCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToTheNextRadioStationTest() {
        radio.setNumberCurrentRadioStation(5);
        radio.nextRadioStation();

        int expected = 6;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchFirstRadioStationTest() {
        radio.setNumberCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToThePrevRadioStationTest() {
        radio.setNumberCurrentRadioStation(8);
        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void directRadioStationSelectionTest() {
        radio.setNumberCurrentRadioStation(3);

        int expected = 3;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationMoreMaxTest() {
        radio.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationLessMinTest() {
        radio.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundReachedMaxTest() {
        radio.setCurrentVolumeSound(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseCurrentVolumeTest() {
        radio.setCurrentVolumeSound(15);
        radio.increaseVolume();

        int expected = 16;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundReachedMinTest() {
        radio.setCurrentVolumeSound(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolumeTest() {
        radio.setCurrentVolumeSound(48);
        radio.decreaseVolume();

        int expected = 47;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeSoundMoreMaxTest() {
        radio.setCurrentVolumeSound(101);

        int expected = 0;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeSoundLessMinTest() {
        radio.setCurrentVolumeSound(-1);

        int expected = 0;
        int actual = radio.getCurrentVolumeSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentStation() {
        Radio cond = new Radio(20);
        cond.setNumberCurrentRadioStation(15);

        Assertions.assertEquals(15, cond.getNumberCurrentRadioStation());
    }
}