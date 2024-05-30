import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioStationsMaxChanget() {

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(11);

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно(5/5,12/0,-1/0)
    }

    @Test
    public void radioStationsMinChanget() {

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(-1);

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно(5/5,12/0,-1/0)
    }

    @Test
    public void increasingRadioStation1() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(0);
        rad.next();//

        int expected = 1;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation2() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(-1);
        rad.next();//

        int expected = 1;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation3() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(1);//9 0 5
        rad.next();//

        int expected = 2;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation4() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(5);//9 0 5
        rad.next();//

        int expected = 6;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation5() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(8);//9 0 5
        rad.next();//

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation6() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(9);//9 0 5
        rad.next();//

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation7() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(11);
        rad.next();//

        int expected = 1;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void increasingRadioStation8() {//увеличиваем радиостанцию

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(20);
        rad.next();

        int expected = 1;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }


    @Test
    public void reducingRadioStation1() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation2() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(1);
        rad.prev();

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation3() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(-1);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation4() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(5);
        rad.prev();

        int expected = 4;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation5() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(8);
        rad.prev();

        int expected = 7;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation6() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(9);
        rad.prev();

        int expected = 8;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation7() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(10);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation8() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(11);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    @Test
    public void reducingRadioStation9() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(20);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

    //громкость звука

    @Test
    public void shouldMaxVolume() {

        Radio rad = new Radio();
        rad.setMaxMinVolume(200);// = 100;

        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно


    }

    @Test
    public void shouldMinVolume() {

        Radio rad = new Radio();
        rad.setMaxMinVolume(-1);// = 100;

        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно


    }


    @Test
    public void turnVolume1() {
        Radio rad = new Radio();//
        rad.setMaxMinVolume(1);

        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume2() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(0);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume3() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(50);

        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume4() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume5() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume6() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(101);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void turnVolume7() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(200);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume1() {//уменьшение громкости

        Radio rad = new Radio();
        rad.setMaxMinVolume(0);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume2() {//уменьшение громкости

        Radio rad = new Radio();
        rad.setMaxMinVolume(1);

        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume3() {//уменьшение громкости

        Radio rad = new Radio();
        rad.setMaxMinVolume(50);

        rad.reduceVolume();
        int expected = 49;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume4() {//уменьшение громкости

        Radio rad = new Radio();
        rad.setMaxMinVolume(100);

        rad.reduceVolume();
        int expected = 99;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test

    public void turnDownVolume5() {//уменьшение громкости

        Radio rad = new Radio();
        rad.setMaxMinVolume(99);

        rad.reduceVolume();
        int expected = 98;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }
}




