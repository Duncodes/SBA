package io.github.duncodes.sba.Model;


import java.util.Date;

/**
 * Created by duncan on 2/6/17.
 */

public class Inventory {
    private String Name;
    private Float Price;
    private Float shippingPrice;

    public Float getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Float shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Category category;
    private Integer unitNumber;
    private String description;
    private Date date;

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
