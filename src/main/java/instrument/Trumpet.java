package instrument;

public class Trumpet extends Instruments{

    private int noOfValves;

    public Trumpet(String material, String color, int noOfValves) {
        super(material, color);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public String sound(){
        return "Trumpet goes trump";
    }

    public Double calculateMarkup(double bought){
        double sell = bought * 10;
        return sell;
    }
}
