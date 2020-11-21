import instrument.Guitar;
import instrument.Instruments;
import instrument.Piano;
import instrument.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Guitar guitar;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void before(){
        guitar = new Guitar("Steel", "Red", 50, 4, "bass");
        piano = new Piano("Wood", "Black", 200, 32, "grand");
        trumpet = new Trumpet("Metal", "Gold" , 5, 6);
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
        assertEquals(100.0, guitar.sellingPrice(), 0.0);
    }

    @Test
    public void sellingPiano(){
        assertEquals(220, piano.sellingPrice(), 0.0);
    }

    @Test
    public void sellingTrumpet(){
        assertEquals(50, trumpet.sellingPrice(), 0.0);
    }

    @Test
    public void checkGetProfitGuitar(){
        assertEquals(50, guitar.getProfit(), 0);
    }

    @Test
    public void checkGetProfitPiano(){
        assertEquals(20, piano.getProfit(), 0);
    }

    @Test
    public void checkGetProfitTrumpet(){
        assertEquals(45, trumpet.getProfit(), 0);
    }
}
