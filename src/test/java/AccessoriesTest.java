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
        guitarString = new GuitarString("guitar", 5);
        stand = new Stand("piano", 5);
        reed = new Reed("trumpet", 0.25);
    }

    @Test
    public void sellingString(){
        assertEquals(10, guitarString.sellingPrice(), 0);
    }

    @Test
    public void sellingStand(){
        assertEquals(10, stand.sellingPrice(), 0);
    }

    @Test
    public void sellingReed(){
        assertEquals(0.5, reed.sellingPrice(), 0.00);
    }
}
