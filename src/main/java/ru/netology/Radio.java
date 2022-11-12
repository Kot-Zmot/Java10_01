package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;

    //Геттеры
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //Сеттер громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // Сеттер радиостанций
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //Увеличение громкости на +1
    public void increaseVolume() {
        if (getCurrentVolume() < 10) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    //Понижение громкости на -1
    public void decreaseVolume() {
        if (getCurrentVolume() > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    //Переключение радиостанции на +1
    public void nextStation() {
        if (getCurrentStation() < 9) {
            setCurrentStation(currentStation + 1);
        } else {
            setCurrentStation(0);
        }
    }

    //Переключение радиостанции на -1
    public void prevStation() {
        if (getCurrentStation() > 0) {
            setCurrentStation(currentStation - 1);
        } else {
            setCurrentStation(9);
        }
    }


}

