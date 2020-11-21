import accessories.GuitarString;
import accessories.Reed;
import accessories.Stand;
import instrument.Guitar;
import instrument.Piano;
import instrument.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Customer customer1;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    Stand stand;
    GuitarString guitarString;
    Reed reed;
    Shop stock;

    @Before
    public void before(){
        stock = new Shop(500);
        customer = new Customer("Steven" ,5000);
        customer1 = new Customer("John" ,50);
        guitar = new Guitar("Steel", "Red", 50, 4, "bass");
        piano = new Piano("Wood", "Black", 200, 32, "grand");
        trumpet = new Trumpet("Metal", "Gold" , 5, 6);
        guitarString = new GuitarString("guitar", 5);
        stand = new Stand("piano", 5);
        reed = new Reed("trumpet", 0.25);
        customer.addEquipment(guitar);
        stock.addToStock(guitar);
    }

    @Test
    public void canAddToCustomersEquipment(){
        customer.addEquipment(guitar);
        assertEquals(2, customer.getEquipmentCount());
    }

    @Test
    public void canRemoveFromCustomersEquipment(){
        customer.removeEquipment(guitar);
        assertEquals(0, customer.getEquipmentCount());
    }

    @Test
    public void canAddToWallet(){
        assertEquals(5500, customer.addMoney(500), 0.0);
    }

    @Test
    public void canRemoveFromWallet(){
        assertEquals(4500, customer.removeMoney(500), 0.0);
    }

    @Test
    public void canBuyEquipment(){
        customer.addEquipment(guitar);
        customer.addEquipment(guitarString);
        customer.removeMoney(guitar.sellingPrice());
        customer.removeMoney(guitarString.sellingPrice());
        assertEquals(3, customer.getEquipmentCount());
        assertEquals(4890, customer.getWallet(), 0);
    }

    @Test
    public void canSellEquipment(){
        customer.removeEquipment(guitar);
        customer.addMoney(guitar.sellingPrice());
        assertEquals(0, customer.getEquipmentCount());
        assertEquals(5100, customer.getWallet(), 0);
    }

    @Test
    public void canBuyEquipmentFromShop(){
        customer.removeMoney(guitar.sellingPrice());
        stock.removeFromStock(guitar);
        stock.addToTill(guitar.sellingPrice());
        assertEquals(0, stock.getStockCount());
        assertEquals(1, customer.getEquipmentCount());
        assertEquals(4900, customer.getWallet(), 0);
        assertEquals(600, stock.getTill(), 0);
    }
}
