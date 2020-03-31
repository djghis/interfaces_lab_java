import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sharp", "AB123", RecordSpeed.THIRTYTHREE);
    }

    @Test
    public void canGetSpeed() {
        assertEquals(RecordSpeed.THIRTYTHREE, recordDeck.getSpeed());
    }

    @Test
    public void canPlay() {
        assertEquals("RecordDeck playing at THIRTYTHREE RPM.", recordDeck.play());
    }


}
