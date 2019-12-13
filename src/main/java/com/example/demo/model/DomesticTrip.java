package com.example.demo.model;

import lombok.Data;

@Data
public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;
    public DomesticTrip(MyDate start, MyDate end, String description) {
        super(start, end, description);
    }

    public DomesticTrip(MyDate start, MyDate end, String description, double ownArrivalDiscount) {
        super(start, end, description);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrince() {
        return super.getPrince()+ownArrivalDiscount;
    }

    @Override
    public void setPrince(double price) {
        super.setPrince(price);
    }

    @Override
    public String toString() {
        return "DomesticTrip{" +
                "ownArrivalDiscount=" + ownArrivalDiscount +
                ", prince=" + prince +
                '}';
    }

    public double getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }
}
