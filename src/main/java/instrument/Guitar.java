package instrument;

public class Guitar extends Instruments{

    private int noOfStrings;
    private String type;

    public Guitar(String material, String color, double bought, int noOfStrings, String type) {
        super(material, color, bought);
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

    public Double sellingPrice(){
        double bought = getBought();
        double sell = bought * 2;
        return sell;
    }


}
