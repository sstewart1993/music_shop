package accessories;

import behaviours.ISell;

public class Stand implements ISell {

    private String goesWith;

    public Stand(String goesWith) {
        this.goesWith = goesWith;
    }

    public Double calculateMarkup(double bought){
        double sell = bought * 2;
        return sell;
    }
}
