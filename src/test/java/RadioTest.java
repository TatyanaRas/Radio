import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioStationsChanget() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadio(5);

        int expected = 5;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно(5/5,12/0,-1/0)
    }

    @Test
    public void shouldSetToMaxNext() {

        Radio rad = new Radio();

        rad.setNumberCurrentRadio(0);//9 0 5
        rad.next();//

        int expected = 1;
        int actual = rad.getNumberCurrentRadio();
        Assertions.assertEquals(expected, actual);//верно
    }

    @Test
    public void shouldSetNoMaxNext() {

        Radio rad = new Radio();
        rad.setNumberCurrentRadio(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberCurrentRadio();

        Assertions.assertEquals(expected, actual);//верно

    }

@Test
    public void shouldMaxMinVolume() { //громкость звука

        Radio rad = new Radio();
        rad.setMaxMinVolume(200);// = 100;

        int expected = 0;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно


    }
@Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();//проверка на текущую громкость
        rad.setMaxMinVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getMaxMinVolume();

        Assertions.assertEquals(expected, actual);//верно
    }

@Test

    public void shouldSetReduceVolume() {

        Radio rad = new Radio();
        rad.setMaxMinVolume(5);

        rad.reduceVolume();
        int expected = 4;
        int actual = rad.getMaxMinVolume();
        Assertions.assertEquals(expected, actual);//верно
    }

}




