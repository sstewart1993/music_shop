package accessories;

import behaviours.ISell;

public class Stand implements ISell {

    private String goesWith;
    private double bought;

    public Stand(String goesWith, double bought) {
        this.goesWith = goesWith;
        this.bought = bought;
    }

    public String getGoesWith() {
        return goesWith;
    }

    public double getBought() {
        return bought;
    }

    public Double sellingPrice(){
        double bought = getBought();
        double sell = bought * 2;
        return sell;
    }

    public double getProfit(){
        double profit = sellingPrice() - getBought();
        return profit;
    }
}
