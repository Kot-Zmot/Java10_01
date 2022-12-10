package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int minStation;
    private int maxStation;
    private int minVolume;
    private int maxVolume;
    private int sizeRadio;

    public Radio(int sizeRadio) {
        this.maxStation = sizeRadio -1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }
}

