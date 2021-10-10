package ru.netology.radio;

public class Radio {


    private int station;
    private int countStation = 10;// Кол-во станций, а не номер максимальной
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private String zero;

    public Radio() {

    }

    public Radio(int stationMax) {
        this.countStation = stationMax;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (countStation == 0) {
            this.station = 0;
        }
        else if (station >= countStation) {
            this.station = countStation-1;
        }
        else if (station <= 0) {
            this.station = 0;
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
        } else if (volume <= 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public void setZero(String zero) {
        this.zero = zero;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int increaseStation() {
        if (station >= countStation-1) {
            this.station = 0;
        } else {
            this.station = ++station;
        }
        return this.station;

    }

    public int decreaseStation() {
        if (countStation == 0) {
            this.station = 0;
        } else if (station <= 0) {
            this.station = countStation-1;
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
        if (countStation == 0) {
            this.station = 0;
        }
        else if (countZero <= 0) {
            this.station = station;
        }
        else if (countZero >= countStation) {
            this.station = countStation-1;
        }
        else {
            this.station = countZero;
        }
        return this.station;
    }
}
