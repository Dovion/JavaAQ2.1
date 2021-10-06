package ru.netology.radio;

public class Radio {


    private int station;
    private int stationMax = 10;
    private int stationMin = 0;
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private String zero;

    public Radio() {

    }

    public Radio(int stationMax) {
        this.stationMax = stationMax;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (stationMax == stationMin) {
            this.station = stationMin;
        }
        else if (station >= stationMax) {
            this.station = stationMax-1;
        }
        else if (station <= stationMin) {
            this.station = stationMin;
        }
        else {
            this.station = station;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= volumeMax) {
            this.volume = volumeMax;
        } else if (volume <= stationMin) {
            this.volume = stationMin;
        } else {
            this.volume = volume;
        }
    }

    public void setZero(String zero) {
        this.zero = zero;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int increaseStation() {
        if (station >= stationMax-1) {
            this.station = stationMin;
        } else {
            this.station = ++station;
        }
        return this.station;

    }

    public int decreaseStation() {
        if (stationMax == stationMin) {
            this.station = stationMin;
        } else if (station <= stationMin) {
            this.station = stationMax-1;
        } else {
            this.station = --station;
        }
        return this.station;

    }

    public int increaseVolume() {
        if (volume >= volumeMax) {
            this.volume = volumeMax;
        } else {
            this.volume = ++volume;
        }
        return this.volume;
    }

    public int decreaseVolume() {
        if (volume <= volumeMin) {
            this.volume = volumeMin;
        } else {
            this.volume = --volume;
        }
        return this.volume;

    }

    public int setStationByZero(){
        int countZero=0;
        for (char element : zero.toCharArray()){
            if (element == '0') countZero++;
        }
        if (stationMax == stationMin) {
            this.station = stationMin;
        }
        else if (countZero <= stationMin) {
            this.station = station;
        }
        else if (countZero >= stationMax) {
            this.station = stationMax-1;
        }
        else {
            this.station = countZero;
        }
        return this.station;
    }
}
