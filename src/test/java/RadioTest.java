import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioStationsChanget() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadio(1);
        int expected = 2;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNext() {

        Radio rad = new Radio();
        rad.next();
        int expected = 9;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetMaxNet() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(9);

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }
    //громкость звука

    public void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.increaseVolume = 2;

        int expected = 1;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    public void shouldMaxVolume() {

        Radio rad = new Radio();
        rad.increaseVolume = 100;
        int expected = 88;
        int actual = rad.increaseVolume();
        Assertions.assertEquals(expected, actual);


    }

    public void shouldReduceVolume() {


        Radio rad = new Radio();
        rad.increaseVolume = 1;
        int expected = 2;
        int actual = rad.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    public void shouldMinVolume() {


        Radio rad = new Radio();
        rad.increaseVolume = 0;
        int expected = 9;
        int actual = rad.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}




