package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentNumberOfStations = 10;
    private int currentStation;
    private int currentVolume;

    //    public Radio() {
//    }
//// конструктор для установки количества станций при создании объекта:
//    public Radio(int currentNumberOfStations) {
//        this.currentNumberOfStations = currentNumberOfStations;
//    }
//
//    //конструктор для тестирования уровня громкости:
//    public Radio(int currentNumberOfStations, int currentStation, int currentVolume) {
//        this.currentNumberOfStations = currentNumberOfStations;
//        this.currentStation = currentStation;
//        this.currentVolume = currentVolume;
//    }
//
//    public int getCurrentStation() { return currentStation;}
//
//    public int getCurrentVolume() {return currentVolume;}
//
//    public int getNumberOfStations() {return currentNumberOfStations;}
//
    public void nextStation() {
        if (currentStation < currentNumberOfStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }


    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = currentNumberOfStations - 1;
        }
    }

    //
    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > currentNumberOfStations) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }

}
