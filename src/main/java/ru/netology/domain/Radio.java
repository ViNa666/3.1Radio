package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        else
            currentStation = 0;
    }


    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        else currentStation = 9;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

        public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else return;
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else return;
    }

}
