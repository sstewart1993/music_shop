import instrument.Guitar;
import instrument.Instruments;
import instrument.Piano;
import instrument.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Instruments instrument;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void before(){
        instrument = new Instruments("plastic", "purple");
        guitar = new Guitar("Steel", "Red", 4, "bass");
        piano = new Piano("Wood", "Black", 32, "grand");
        trumpet = new Trumpet("Metal", "Gold" ,6);
    }

    @Test
    public void guitarNoise(){
        assertEquals("Guitar goes strum",guitar.sound());
    }

    @Test
    public void pianoNoise(){
        assertEquals("Piano goes ding",piano.sound());
    }

    @Test
    public void trumpetNoise(){
        assertEquals("Trumpet goes trump",trumpet.sound());
    }

    @Test
    public void sellingGuitar(){
        assertEquals(90.0, guitar.calculateMarkup(45.0), 0.0);
    }

    @Test
    public void sellingPiano(){
        assertEquals(55, piano.calculateMarkup(50), 0);
    }

    @Test
    public void sellingTrumpet(){
        assertEquals(200, trumpet.calculateMarkup(20), 0.0);
    }
}
