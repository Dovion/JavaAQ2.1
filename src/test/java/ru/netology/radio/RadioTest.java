package ru.netology.radio;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    public Radio radio = new Radio();
    public Radio radioCustomHigh = new Radio(100);
    public Radio radioCustomLow = new Radio(0);

    @Test
    void setCurrentStation() {

        radio.setStation(5);
        int actual = radio.getStation();
        int expected = 5; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationHigh() {

        radio.setStation(99);
        int actual = radio.getStation();
        int expected = 9; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationLow() {

        radio.setStation(0);
        int actual = radio.getStation();
        int expected = 0; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStation() {

        radio.setStation(5);
        radio.increaseStation();
        int actual = radio.getStation();
        int expected = 6; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationHigh() {

        radio.setStation(99);
        radio.increaseStation();
        int actual = radio.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationLow() {

        radio.setStation(0);
        radio.increaseStation();
        int actual = radio.getStation();
        int expected = 1; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStation() {

        radio.setStation(5);
        radio.decreaseStation();
        int actual = radio.getStation();
        int expected = 4; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationHigh() {

        radio.setStation(99);
        radio.decreaseStation();
        int actual = radio.getStation();
        int expected = 8; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationLow() {

        radio.setStation(0);
        radio.decreaseStation();
        int actual = radio.getStation();
        int expected = 9; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolume() {

        radio.setVolume(50);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 51; //Ожидаемое значение громкости после нажатия кнопки +
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeHigh() {

        radio.setVolume(100);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 100; //Ожидаемое значение громкости после нажатия кнопки +
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseVolumeLow() {

        radio.setVolume(0);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 1; //Ожидаемое значение громкости после нажатия кнопки +
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseVolume() {

        radio.setVolume(50);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 49; //Ожидаемое значение громкости после нажатия кнопки -
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseVolumeHigh() {

        radio.setVolume(100);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 99; //Ожидаемое значение громкости после нажатия кнопки -
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseVolumeLow() {

        radio.setVolume(0);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 0; //Ожидаемое значение громкости после нажатия кнопки -
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationCustomHigh() {

        radioCustomHigh.setStation(50);
        int actual = radioCustomHigh.getStation();
        int expected = 50; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationHighCustomHigh() {

        radioCustomHigh.setStation(999);
        int actual = radioCustomHigh.getStation();
        int expected = 99; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationLowCustomHigh() {

        radioCustomHigh.setStation(0);
        int actual = radioCustomHigh.getStation();
        int expected = 0; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationCustomHigh() {

        radioCustomHigh.setStation(50);
        radioCustomHigh.increaseStation();
        int actual = radioCustomHigh.getStation();
        int expected = 51; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationHighCustomHigh() {

        radioCustomHigh.setStation(999);
        radioCustomHigh.increaseStation();
        int actual = radioCustomHigh.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationLowCustomHigh() {

        radioCustomHigh.setStation(0);
        radioCustomHigh.increaseStation();
        int actual = radioCustomHigh.getStation();
        int expected = 1; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationCustomHigh() {

        radioCustomHigh.setStation(50);
        radioCustomHigh.decreaseStation();
        int actual = radioCustomHigh.getStation();
        int expected = 49; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationHighCustomHigh() {

        radioCustomHigh.setStation(999);
        radioCustomHigh.decreaseStation();
        int actual = radioCustomHigh.getStation();
        int expected = 98; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationLowCustomHigh() {

        radioCustomHigh.setStation(0);
        radioCustomHigh.decreaseStation();
        int actual = radioCustomHigh.getStation();
        int expected = 99; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationCustomLow() {

        radioCustomLow.setStation(50);
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationHighCustomLow() {

        radioCustomLow.setStation(99);
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationLowCustomLow() {

        radioCustomLow.setStation(0);
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат текущей станции
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationCustomLow() {

        radioCustomLow.setStation(50);
        radioCustomLow.increaseStation();
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationHighCustomLow() {

        radioCustomLow.setStation(999);
        radioCustomLow.increaseStation();
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setIncreaseStationLowCustomLow() {

        radioCustomLow.setStation(0);
        radioCustomLow.increaseStation();
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки next
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationCustomLow() {

        radioCustomLow.setStation(50);
        radioCustomLow.decreaseStation();
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationHighCustomLow() {

        radioCustomLow.setStation(999);
        radioCustomLow.decreaseStation();
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setDecreaseStationLowCustomLow() {

        radioCustomLow.setStation(0);
        radioCustomLow.decreaseStation();
        int actual = radioCustomLow.getStation();
        int expected = 0; //Ожидаемый результат станции после нажатия кнопки prev
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZero() {

        radio.setStation(5);
        radio.setZero("0000");
        radio.setStationByZero();
        int actual = radio.getStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroHigh() {

        radio.setStation(5);
        radio.setZero("000000000000000");
        radio.setStationByZero();
        int actual = radio.getStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroLow() {

        radio.setStation(5);
        radio.setZero("1");
        radio.setStationByZero();
        int actual = radio.getStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroCustomHigh() {

        radioCustomHigh.setStation(50);
        radioCustomHigh.setZero("0000");
        radioCustomHigh.setStationByZero();
        int actual = radioCustomHigh.getStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroHighCustomHigh() {

        radioCustomHigh.setStation(999);
        int[] tArray = new int[150];
        String[] tArray1 = new String[150];
        int i;
        for(i = 0; i < tArray.length; i++){
            tArray1[i] = String.valueOf(tArray[i]);
        }
        String x = String.join("",tArray1);
        radioCustomHigh.setZero(x);
        radioCustomHigh.setStationByZero();
        int actual = radioCustomHigh.getStation();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroLowCustomHigh() {

        radioCustomHigh.setStation(0);
        radioCustomHigh.setZero("1");
        radioCustomHigh.setStationByZero();
        int actual = radioCustomHigh.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroCustomLow() {

        radioCustomLow.setStation(5);
        radioCustomLow.setZero("0000");
        radioCustomLow.setStationByZero();
        int actual = radioCustomLow.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroHighCustomLow() {

        radioCustomLow.setStation(999);
        radioCustomLow.setZero("00000000000000000000000000000000000000000000000000000");
        radioCustomLow.setStationByZero();
        int actual = radioCustomLow.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setStationByZeroLowCustomLow() {

        radioCustomLow.setStation(0);
        radioCustomLow.setZero("1");
        radioCustomLow.setStationByZero();
        int actual = radioCustomLow.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }



}