import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    Mp3Player mp3Player;

    @Before
    public void setUp() {
        mp3Player = new Mp3Player("Bosch", "ROLF22", "Alasdair's Mp3", null);
    }

    @Test
    public void checkCanGetName() {
        assertEquals("Alasdair's Mp3", mp3Player.getName());
    }
}
