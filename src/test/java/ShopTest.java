import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop stock;

    @Before
    public void before(){
        stock = new Shop(5);
    }

    @Test
    public void canAddToStock(){
        stock.addToStock("Guitar");
        assertEquals(1, stock.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        stock.addToStock("Guitar");
        stock.removeFromStock("Guitar");
        assertEquals(0, stock.getStockCount());
    }
}
