public class Radio {
    //радиостанции
   // public int setIncreaseVolume;
    public int numberCurrentRadio;
    public int currentVolume;
    public int ReduceVolume;
//    public int IncreaseVolume;
   // public int ReduceVolume;

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
        // if (newNumberCurrentRadio > 0) {
        //   newNumberCurrentRadio = newNumberCurrentRadio + 1;
        //  }
        numberCurrentRadio = newNumberCurrentRadio;
    }


    public void next() {
        //numberCurrentRadio = 9;
        if (numberCurrentRadio == 9) {//==
            numberCurrentRadio = 0;
        }
        // if (numberCurrentRadio > 0) {//
        else {
            numberCurrentRadio = numberCurrentRadio + 1;//
        }
    }

    public void prev(int i) {
        //numberCurrentRadio = 0;
        if (numberCurrentRadio < 0) {
            numberCurrentRadio = numberCurrentRadio - 1;
        } else {
            numberCurrentRadio = 9;
        }
    }


    //громкость звука
    public int increaseVolume(int i) {
        // int currentVolume;
        // currentVolume = 0;
        if (currentVolume < 100) {//если меньше 100, шаг +1
            currentVolume = currentVolume + 1;
        } else {

            return;
        }
    }

    public void maxMinVolume() {
        // если текущая 100, при увеличении выход из метода
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) { // если текущая 0 и уменьшаем, выход из метода
            return;
        }
    }


    public void ReduceVolume() {

        if (currentVolume < 100) {//если текущая 99, то шаг +1
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }


}



