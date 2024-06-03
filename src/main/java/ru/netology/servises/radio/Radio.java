package ru.netology.servises.radio;

public class Radio {
    //радиостанции

    private int minRadioStations = 0;
    private int maxRadioStations;// = 10;

    private int numberCurrentRadio = minRadioStations;//может макс
    private int maxMinVolume;

    public Radio(int size) {
        maxRadioStations = minRadioStations + size;
    }

    public Radio() {
        maxRadioStations = 10;

    }


  /*  public Radio(int minRadioStations, int maxRadioStations) {

        this.minRadioStations = minRadioStations;
        this.maxRadioStations = maxRadioStations;
        this.numberCurrentRadio = minRadioStations;

    }*/


    //радиостанции
    public int getNumberCurrentRadio() {

        return numberCurrentRadio;
    }

    public int getMaxRadioStations() {
        return maxRadioStations;
    }

    public int getMinRadioStations() {
        return minRadioStations;
    }


    public void setNumberCurrentRadio(int newNumberCurrentRadio) {

        if (newNumberCurrentRadio < minRadioStations) {
            return;
        }
        if (newNumberCurrentRadio > maxRadioStations) {
            return;
        }

        this.numberCurrentRadio = newNumberCurrentRadio;
    }


    public void next() {

        if (numberCurrentRadio == maxRadioStations) {
            numberCurrentRadio = minRadioStations;
        } else {
            numberCurrentRadio = maxRadioStations - 1;
        }
    }

    public void prev() {

        if (numberCurrentRadio != minRadioStations) {
            numberCurrentRadio = numberCurrentRadio - 1;
        } else {

            numberCurrentRadio = maxRadioStations;
        }
    }


    //громкость звука
    public int getMaxMinVolume() {
        return maxMinVolume;
    }

    public void setMaxMinVolume(int newMaxMinVolume) {//проверка на пределы громкости
        // если текущая 100, при увеличении выход из метода
        if (newMaxMinVolume > 100) {
            return;
        }

        if (newMaxMinVolume < 0) { // если текущая 0 и уменьшаем, выход из метода
            return;
        }
        this.maxMinVolume = newMaxMinVolume;
    }

    public void increaseVolume() {//увеличение громкости
        if (maxMinVolume != 100) {//если меньше 100, шаг +1
            //  maxMinVolume = 0;
            maxMinVolume = maxMinVolume + 1;
        } else {

            maxMinVolume = 100;
        }
    }


    public void reduceVolume() {//уменьшение громкости

        if (maxMinVolume != 0) {
            maxMinVolume = maxMinVolume - 1;
        } else {
            maxMinVolume = 0;
        }
    }


}



