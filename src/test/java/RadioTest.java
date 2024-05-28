import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioStationsChanget() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadio(-1);
        int expected = 0;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно(5/5,12/0,-1/0)
    }

    @Test
    public void shouldSetToMaxNext() {

        Radio rad = new Radio();
        rad.next();//9 0 5

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void shouldNoSetMaxNext() {

        Radio rad = new Radio();
        rad.prev(0);//9

        int expected = 0;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }
    //громкость звука

    public void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.increaseVolume(2);

        int expected = 2;
        int actual = rad.currentVolume();

        Assertions.assertEquals(expected, actual);
    }

    public void shouldMaxMinVolume() {

        Radio rad = new Radio();
        rad.maxMinVolume(101);// = 100;
        int expected = 100;
        int actual = rad.currentVolume();
        Assertions.assertEquals(expected, actual);


    }

    public void shouldReduceVolume() {


        Radio rad = new Radio();
        rad.ReduceVolume = 1;
        int expected = 2;
        int actual = rad.currentVolume();
        Assertions.assertEquals(expected, actual);
    }

}




