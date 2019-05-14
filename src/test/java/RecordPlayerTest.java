import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;


    @Before
    public void setUp()  {
       recordPlayer = new RecordPlayer("Sonny", "WTF13", "Alasdayrh", 3, null);
    }

    @Test
    public void checkHasMake() {
        assertEquals("Sonny", recordPlayer.getMake());
    }

    @Test
    public void checkHasModel() {
        assertEquals("WTF13", recordPlayer.getModel());
    }

    @Test
    public void checkPlaySpeeds() {
        assertEquals(3, recordPlayer.getPlaySpeeds());
    }

    @Test
    public void checkSongNull() {
        assertEquals(null, recordPlayer.getSong());
    }

    @Test
    public void checkCanSetSong() {
        recordPlayer.play("Bohemian Rhapsody");
        assertEquals("Bohemian Rhapsody", recordPlayer.getSong());
    }
}
