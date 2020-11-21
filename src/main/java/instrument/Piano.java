package instrument;

public class Piano extends Instruments{

    private int noOfKeys;
    private String type;

    public Piano(String material, String color, double bought, int noOfKeys, String type) {
        super(material, color, bought);
        this.noOfKeys = noOfKeys;
        this.type = type;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public String getType() {
        return type;
    }

    public String sound(){
        return "Piano goes ding";
    }

    public Double sellingPrice(){
        double bought = getBought();
        double selling = bought + (bought /10);
        return selling;
    }


}
