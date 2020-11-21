import behaviours.ISell;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import instrument.Instruments;

import java.util.ArrayList;

public class Shop {

    public ArrayList<ISell> stock;
    public int Till;

    public Shop(int till) {
        Till = till;
        stock = new ArrayList<ISell>();

    }

    public int getTill() {
        return Till;
    }

    public void addToStock(ISell iSell){
        stock.add(iSell);
    }

    public ArrayList<ISell> getStock(){
        return this.stock;
    }


    public int getStockCount() {
        return stock.size();
    }

    public void removeFromStock(Instruments instruments) {
        stock.remove(instruments);
    }


    public double addToTill(double i) {
        return Till += i;
    }

    public double removeFromTill(double i) {
        return Till -= i;
    }

    public double totalProfit(){
        double total = 0;
        for(ISell instruments : this.stock){
            total += instruments.getProfit();
        }
        return total;
    }
}
