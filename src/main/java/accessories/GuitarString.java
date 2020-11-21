package accessories;

import behaviours.ISell;

public class GuitarString implements ISell {

    private String goesWith;

    public GuitarString(String goesWith) {
        this.goesWith = goesWith;
    }

    public Double calculateMarkup(double bought){
        double sell = bought * 2;
        return sell;
    }
}
