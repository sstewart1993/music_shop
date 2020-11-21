package instrument;

public class Guitar extends Instruments{

    private int noOfStrings;
    private String type;

    public Guitar(String material, String color, int noOfStrings, String type) {
        super(material, color);
        this.noOfStrings = noOfStrings;
        this.type = type;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getType() {
        return type;
    }

    public String sound(){
        return "Guitar goes strum";
    }

    public Double calculateMarkup(double bought){
        double sell = bought * 2;
        return sell;
    }
}
