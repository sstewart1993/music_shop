package instrument;

import behaviours.IPlay;
import behaviours.ISell;

public class Instruments implements IPlay, ISell {

    private String material;
    private String color;
    private double bought;

    public Instruments(String material, String color, double bought ) {
        this.material = material;
        this.color = color;
        this.bought = bought;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getBought() {
        return bought;
    }

    public String sound() {
        return null;
    }

    public Double sellingPrice() {
        return null;
    }

    public double getProfit(){
        double profit = sellingPrice() - getBought();
        return profit;
    }
}
