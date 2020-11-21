import accessories.GuitarString;
import accessories.Reed;
import accessories.Stand;
import instrument.Guitar;
import instrument.Piano;
import instrument.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop stock;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    Stand stand;
    GuitarString guitarString;
    Reed reed;

    @Before
    public void before(){
        stock = new Shop(500);
        guitar = new Guitar("Steel", "Red", 50, 4, "bass");
        piano = new Piano("Wood", "Black", 200, 32, "grand");
        trumpet = new Trumpet("Metal", "Gold" , 5, 6);
        guitarString = new GuitarString("guitar", 5);
        stand = new Stand("piano", 5);
        reed = new Reed("trumpet", 0.25);
        stock.addToStock(guitar);
        stock.addToStock(piano);
        stock.addToStock(trumpet);
        stock.addToStock(guitarString);
        stock.addToStock(stand);
        stock.addToStock(reed);
    }

    @Test
    public void canAddToStock(){
        stock.addToStock(guitar);
        assertEquals(7, stock.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        stock.removeFromStock(guitar);


        assertEquals(5, stock.getStockCount());
    }

    @Test
    public void canAddToTill(){
        assertEquals(550, stock.addToTill(50), 0.0);
    }

    @Test
    public void canRemoveFromTill(){
        assertEquals(450, stock.removeFromTill(50), 0.0);
    }

    @Test
    public void canSellGuitar(){
        stock.addToTill(guitar.sellingPrice());
        stock.removeFromStock(guitar);
        assertEquals(5, stock.getStockCount());
        assertEquals(600, stock.getTill(), 0);
    }

    @Test
    public void canSellMoreThanOne(){
        stock.addToTill(guitar.sellingPrice());
        stock.addToTill(piano.sellingPrice());
        stock.removeFromStock(guitar);
        stock.removeFromStock(piano);
        assertEquals(4, stock.getStockCount());
        assertEquals(820, stock.getTill(), 0);
    }

    @Test
    public void checkProfit(){
        assertEquals(125.25, stock.totalProfit(), 0.01);
    }



}
