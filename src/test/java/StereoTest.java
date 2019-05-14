import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void setUp() {
        stereo = new Stereo("Samsung", "LOL12", "Aly", 30, 5, null, "BBC Radio 1");
    }

    @Test
    public void checkGetMake() {
        assertEquals("Samsung", stereo.getMake());
    }

    @Test
    public void checkHasModel() {
        assertEquals("LOL12", stereo.getModel());
    }

    @Test
    public void checkHasStation() {
        assertEquals("BBC Radio 1", stereo.getStation());
    }

    @Test
    public void checkCanSetStation() {
        stereo.tune("BBC Radio 1");
        assertEquals("BBC Radio 1", stereo.getStation());
    }

    @Test
    public void checkNumberOfCds() {
        assertEquals(30, stereo.getNumCd());
    }

    @Test
    public void checkPlaySpeeds() {
        assertEquals(5, stereo.getPlaySpeeds());
    }
}
