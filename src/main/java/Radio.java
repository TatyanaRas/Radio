public class Radio {
    //радиостанции

    private int numberCurrentRadio;
    //  public int currentVolume;
    //  public int ReduceVolume;
    private int maxMinVolume;

    //радиостанции
    public int getNumberCurrentRadio() {

        return numberCurrentRadio;
    }

    public void setNumberCurrentRadio(int newNumberCurrentRadio) {

        if (newNumberCurrentRadio < 0) {
            return;
        }
        if (newNumberCurrentRadio > 9) {
            return;
        }

        this.numberCurrentRadio = newNumberCurrentRadio;
    }


    public void next() {

        if (numberCurrentRadio != 9) {//== !=
            numberCurrentRadio = numberCurrentRadio + 1;
        } else {
            numberCurrentRadio = 0;   //
        }
    }

    public void prev() {

        if (numberCurrentRadio != 0) {
            numberCurrentRadio = numberCurrentRadio - 1;
        } else {

            numberCurrentRadio = 9;
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



