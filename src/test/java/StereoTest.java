import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Casio", "Thenewestone", "DJSet", 5);
    }

    @Test
    public void volumeCanIncrease(){
        stereo.raiseVolume();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void volumeCanDecrease(){
        stereo.lowerVolume();
        assertEquals(4, stereo.getVolume());
    }
}
