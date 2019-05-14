import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp() {
        radio = new Radio("Phillips", "V14", "Alasdairh", "BBC Radio 2");
    }

    @Test
    public void checkHasModel() {
        assertEquals("V14", radio.getModel());
    }

    @Test
    public void checkHasMake() {
        assertEquals("Phillips", radio.getMake());
    }

    @Test
    public void checkHasStation() {
        assertEquals("BBC Radio 2", radio.getStation());
    }
    @Test
    public void checkCanSetStation() {
        radio.tune("BBC Radio 1");
        assertEquals("BBC Radio 1", radio.getStation());
    }
}
