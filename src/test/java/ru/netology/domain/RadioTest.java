package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetCurrentStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationIfCurrentIsMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationIfCurrentIsMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
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
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
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
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}