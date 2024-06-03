package ru.netology.servises.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
public class RadioTest {

    @Test

    public void currentStations() {//текущая станция

        Radio rad = new Radio(25);


        Assertions.assertEquals(0, rad.getMinRadioStations());
        Assertions.assertEquals(25, rad.getMaxRadioStations());

    }

    @Test
    public void radioStationsMaxChanget() {

        Radio rad = new Radio(10);

        rad.setNumberCurrentRadio(12);

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationsMinChanget1() {

        Radio rad = new Radio(10);

        rad.setNumberCurrentRadio(-1);

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);


    }


    //увеличиваем номер радиостанции
    @Test
    public void increasingRadioStation1() {

        Radio rad = new Radio(20);

        // rad.setNumberCurrentRadio(9);
        rad.next();//

        int expected = 19;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation2() {

        Radio rad = new Radio(11);

        // rad.setNumberCurrentRadio(10);
        rad.next();//

        int expected = 10;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation3() {

        Radio rad = new Radio(5);

        // rad.setNumberCurrentRadio(5);
        rad.next();//

        int expected = 4;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increasingRadioStation4() {//решаем

        Radio rad = new Radio(10);

        rad.setNumberCurrentRadio(10);
        rad.next();//

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    //уменьшаем номер радиостанции

    @Test
    public void reducingRadioStation1() {

        Radio rad = new Radio(10);
        rad.setNumberCurrentRadio(0);
        rad.prev();

        int expected = 10;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation2() {

        Radio rad = new Radio(15);
        rad.setNumberCurrentRadio(5);
        rad.prev();

        int expected = 4;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }


    //громкость звука

    @Test
    public void shouldMaxVolume() {

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(200);// = 100;

        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно


    }

    @Test
    public void shouldMinVolume() {

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(-1);// = 100;

        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно


    }


    @Test
    public void turnVolume1() {
        Radio rad = new Radio(0, 100);//
        rad.setMaxMinVolume(1);

        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume2() {
        Radio rad = new Radio(0, 100);//проверка на текущую громкость
        rad.setMaxMinVolume(0);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume3() {
        Radio rad = new Radio(0, 100);//проверка на текущую громкость
        rad.setMaxMinVolume(50);

        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume4() {
        Radio rad = new Radio(0, 100);//проверка на текущую громкость
        rad.setMaxMinVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume5() {
        Radio rad = new Radio(0, 100);//проверка на текущую громкость
        rad.setMaxMinVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume6() {
        Radio rad = new Radio(0, 100);//проверка на текущую громкость
        rad.setMaxMinVolume(101);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume7() {
        Radio rad = new Radio(0, 100);//проверка на текущую громкость
        rad.setMaxMinVolume(200);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume1() {//уменьшение громкости

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(0);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume2() {//уменьшение громкости

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(1);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume3() {//уменьшение громкости

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(50);

        rad.reduceVolume();
        int expected = 49;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume4() {//уменьшение громкости

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(100);

        rad.reduceVolume();
        int expected = 99;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume5() {//уменьшение громкости

        Radio rad = new Radio(0, 100);
        rad.setMaxMinVolume(99);

        rad.reduceVolume();
        int expected = 98;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }
}




