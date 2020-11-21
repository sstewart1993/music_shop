package instrument;

import behaviours.IPlay;
import behaviours.ISell;

public class Instruments implements IPlay, ISell {

    private String material;
    private String color;

    public Instruments(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String sound() {
        return null;
    }

    public Double calculateMarkup(double bought) {
        return null;
    }
}
