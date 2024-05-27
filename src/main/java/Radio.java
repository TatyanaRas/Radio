public class Radio {
    //радиостанции
    private int numberCurrentRadio;
    private int increaseVolume;
    private int currentVolume;

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
        if (numberCurrentRadio > 9) {//==
            numberCurrentRadio = 0;
        }
       // if (numberCurrentRadio > 0) {//
       else {     numberCurrentRadio = numberCurrentRadio + 1;
        }
    }

    public void prev() {
        //numberCurrentRadio = 0;
        if (numberCurrentRadio < 0) {
            numberCurrentRadio = numberCurrentRadio - 1;
        }
        else {
            numberCurrentRadio = 9;
        }
    }


    //громкость звука
    public int increaseVolume() {
        // int currentVolume;
        // currentVolume = 0;
        if (currentVolume < 100) {//если меньше 100, шаг +1
            currentVolume = currentVolume + 1;
        }
        // return currentVolume;
    }


    public void maxVolume() {
      //  int currentVolume;
       // currentVolume = 100;// если текущая 100, при увеличении выход из метода
        if (currentVolume > 100) {
            return;
        }
    }

    public void reduceVolume() {
      //  int currentVolume;
       // currentVolume = 99;
        if (currentVolume < 100) {//если текущая 99, то шаг +1
            currentVolume = currentVolume + 1;
        }

    }

    public void minVolume() {
       // int currentVolume;


        if (currentVolume < 0) { // если текущая 0 и уменьшаем, выход из метода
            return;
        }
    }
}



