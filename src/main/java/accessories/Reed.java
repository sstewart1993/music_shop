package accessories;

import behaviours.ISell;

public class Reed implements ISell {

    private String goesWith;

    public Reed(String goesWith) {
        this.goesWith = goesWith;
    }

    public Double calculateMarkup(double bought){
        double sell = bought * 2;
        return sell;
    }
}
