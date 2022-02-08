package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetCurrentStationNoArgs() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationUseConstructorAllArgs() {
        Radio radio = new Radio(50, 0, 0);
        radio.setCurrentStation(44);
        int expected = 44;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationOverLimitNoArgs() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationOverLimitUseConstructorAllArgs() {
        Radio radio = new Radio(50, 0, 0);
        radio.setCurrentStation(51);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStationNoArgs() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationUseConstructorAllArgs() {
        Radio radio = new Radio(50, 0,0);
        radio.setCurrentStation(44);
        radio.nextStation();
        int expected = 45;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfCurrentIsMaxNoArgs() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfCurrentIsMaxUseConstructorAllArgs() {
        Radio radio = new Radio(50, 0, 0);
        radio.setCurrentStation(49);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNoArgs() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationUseConstructorAllArgs() {
        Radio radio = new Radio(50, 0,0);
        radio.setCurrentStation(44);
        radio.prevStation();
        int expected = 43;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfCurrentIsMinNoArgs() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfCurrentIsMinUseConstructorAllArgs() {
        Radio radio = new Radio(50,0,0);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 49;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio2 = new Radio(100, 1, 50);
        radio2.increaseVolume();
        int expected = 51;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentIsMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentIsMax() {
        Radio radio2 = new Radio(10, 1, 100);
        radio2.increaseVolume();
        int expected = 100;
        int actual = radio2.getCurrentVolume();
        assertEquals(expected, actual);
    }


}