import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Forth 1");
    }

    @Test
    public void tuneWorks(){
        assertEquals("You are being tune to Forth 1. Thank you for listening.", radio.tune() );
    }
}
