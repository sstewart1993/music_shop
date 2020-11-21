import java.util.ArrayList;

public class Shop {

    public ArrayList<String> stock;
    public int Till;

    public Shop(int till) {
        Till = till;
        stock = new ArrayList<String>();

    }

    public int getTill() {
        return Till;
    }

    public void addToStock(String newStock){
        stock.add(newStock);
    }

    public int getStockCount() {
        return stock.size();
    }

    public void removeFromStock(String newStock) {
        stock.remove(newStock);
    }
}
