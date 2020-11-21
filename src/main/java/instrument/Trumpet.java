package instrument;

public class Trumpet extends Instruments{

    private int noOfValves;

    public Trumpet(String material, String color, double bought, int noOfValves) {
        super(material, color, bought);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public String sound(){
        return "Trumpet goes trump";
    }

    public Double sellingPrice(){
        double bought = getBought();
        double sell = bought * 10;
        return sell;
    }
}
