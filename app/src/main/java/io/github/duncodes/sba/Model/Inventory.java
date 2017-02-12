package io.github.duncodes.sba.Model;

/**
 * Created by duncan on 2/6/17.
 */

public class Inventory {
    private String Name;
    private Float Price;

    public Inventory(){
        super();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }
}
