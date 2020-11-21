import accessories.GuitarString;
import accessories.Reed;
import accessories.Stand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Stand stand;
    GuitarString guitarString;
    Reed reed;


    @Before
    public void before(){
        stand = new Stand("piano");
        reed = new Reed("trumpet");
        guitarString = new GuitarString("guitar");
    }

    @Test
    public void sellingString(){
        assertEquals(20, guitarString.calculateMarkup(10), 0);
    }

    @Test
    public void sellingStand(){
        assertEquals(10, guitarString.calculateMarkup(5), 0);
    }

    @Test
    public void sellingReed(){
        assertEquals(0.5, guitarString.calculateMarkup(0.25), 0.00);
    }
}
